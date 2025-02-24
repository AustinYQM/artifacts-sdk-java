package com.yqmonline.artifacts.sdk.models.enums
import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Values: weaponcrafting,gearcrafting,jewelrycrafting,cooking,woodcutting,mining,alchemy
 */

enum class CraftSkill(
    val value: String,
) {
    @JsonProperty("weaponcrafting")
    WEAPONCRAFTING("weaponcrafting"),

    @JsonProperty("gearcrafting")
    GEARCRAFTING("gearcrafting"),

    @JsonProperty("jewelrycrafting")
    JEWELRYCRAFTING("jewelrycrafting"),

    @JsonProperty("cooking")
    COOKING("cooking"),

    @JsonProperty("woodcutting")
    WOODCUTTING("woodcutting"),

    @JsonProperty("mining")
    MINING("mining"),

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
        fun encode(data: Any?): String? = if (data is CraftSkill) "$data" else null

        /**
         * Returns a valid [CraftSkill] for [data], null otherwise.
         */
        fun decode(data: Any?): CraftSkill? =
            data?.let {
                val normalizedData = "$it".lowercase()
                entries.firstOrNull { value ->
                    it == value || normalizedData == "$value".lowercase()
                }
            }
    }
}
