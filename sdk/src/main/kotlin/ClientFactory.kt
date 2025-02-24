import com.sksamuel.hoplite.ConfigLoaderBuilder
import com.sksamuel.hoplite.addResourceSource
import config.Config
import io.ktor.client.HttpClient
import io.ktor.client.engine.cio.CIO
import io.ktor.client.plugins.*
import io.ktor.client.plugins.auth.*
import io.ktor.client.plugins.auth.providers.*
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.logging.Logging
import io.ktor.http.*
import io.ktor.serialization.jackson.jackson

val config: Config =
    ConfigLoaderBuilder
        .default()
        .addResourceSource("/application-local.yaml")
        .build()
        .loadConfigOrThrow<Config>()

fun createClient(path: String): HttpClient =
    HttpClient(CIO) {
        followRedirects = true
        defaultRequest {
            url {
                protocol = URLProtocol.HTTPS
                host = config.api.baseUrl + path
            }
            headers {
                append("Content-Type", "application/json")
                append("Accept", "application/json")
            }
        }

        install(Logging)
        install(ContentNegotiation) {
            jackson()
        }
        install(Auth) {
            bearer {
                BearerTokens(
                    accessToken = config.api.token,
                    refreshToken = config.api.token,
                )
                sendWithoutRequest { true }
            }
        }
    }

fun closeClient(client: HttpClient) = client.close()
