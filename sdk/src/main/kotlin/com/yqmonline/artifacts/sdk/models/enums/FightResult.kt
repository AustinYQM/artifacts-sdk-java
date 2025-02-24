
package com.yqmonline.artifacts.sdk.models.enums

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Values: win,loss
 */

enum class FightResult(
    private val value: String,
) {
    @JsonProperty("win")
    WIN("win"),

    @JsonProperty("loss")
    LOSS("loss"),
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
        fun encode(data: Any?): String? = if (data is FightResult) "$data" else null

        /**
         * Returns a valid [FightResult] for [data], null otherwise.
         */
        fun decode(data: Any?): FightResult? =
            data?.let {
                val normalizedData = "$it".lowercase()
                entries.firstOrNull { value ->
                    it == value || normalizedData == "$value".lowercase()
                }
            }
    }
}
