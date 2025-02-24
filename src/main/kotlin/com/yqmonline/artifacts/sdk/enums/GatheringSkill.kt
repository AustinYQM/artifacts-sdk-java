
package com.yqmonline.artifacts.sdk.enums

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Values: mining,woodcutting,fishing,alchemy
 */

enum class GatheringSkill(
    private val value: String,
) {
    @JsonProperty("mining")
    MINING("mining"),

    @JsonProperty("woodcutting")
    WOODCUTTING("woodcutting"),

    @JsonProperty("fishing")
    FISHING("fishing"),

    @JsonProperty("alchemy")
    ALCHEMY("alchemy"),
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
        fun encode(data: Any?): String? = if (data is GatheringSkill) "$data" else null

        /**
         * Returns a valid [GatheringSkill] for [data], null otherwise.
         */
        fun decode(data: Any?): GatheringSkill? =
            data?.let {
                val normalizedData = "$it".lowercase()
                entries.firstOrNull { value ->
                    it == value || normalizedData == "$value".lowercase()
                }
            }
    }
}
