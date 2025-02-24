package config

import kotlinx.serialization.Serializable

@Serializable
data class Config(
    val env: String,
    val api: ApiConfig,
)

@Serializable
data class ApiConfig(
    val token: String,
    val baseUrl: String,
)
