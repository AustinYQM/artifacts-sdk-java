package com.yqmonline.artifacts.sdk.models.enums
import com.fasterxml.jackson.annotation.JsonProperty
import kotlinx.serialization.Serializable

/**
 * Values: men1,men2,men3,women1,women2,women3
 */
@Serializable
enum class CharacterSkin(
    private val value: String,
) {
    @JsonProperty("men1")
    MEN1("men1"),

    @JsonProperty("men2")
    MEN2("men2"),

    @JsonProperty("men3")
    MEN3("men3"),

    @JsonProperty("women1")
    WOMEN1("women1"),

    @JsonProperty("women2")
    WOMEN2("women2"),

    @JsonProperty("women3")
    WOMEN3("women3"),
    ;

    /**
     * Override [toString()] to avoid using the enum variable name as the value, and instead use
     * the actual value defined in the API spec file.
     *
     * This solves a problem when the variable name and its value are different, and ensures that
     * the client sends the correct enum values to the server always.
     */
    override fun toString(): String = value

    companion object {
        /**
         * Converts the provided [data] to a [String] on success, null otherwise.
         */
        fun encode(data: Any?): String? = if (data is com.yqmonline.artifacts.sdk.models.enums.CharacterSkin) "$data" else null

        /**
         * Returns a valid [CharacterSkin] for [data], null otherwise.
         */
        fun decode(data: Any?): com.yqmonline.artifacts.sdk.models.enums.CharacterSkin? =
            data?.let {
                val normalizedData = "$it".lowercase()
                entries.firstOrNull { value ->
                    it == value || normalizedData == "$value".lowercase()
                }
            }
    }
}
