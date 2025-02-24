package com.yqmonline.artifacts.sdk.models.enums.types
import com.fasterxml.jackson.annotation.JsonProperty
import kotlinx.serialization.Serializable

/**
 * Values: combat,woodcutting,mining,fishing,weaponcrafting,gearcrafting,jewelrycrafting,cooking,alchemy
 */
@Serializable
enum class CharacterLeaderboardType(
    private val value: String,
) {
    @JsonProperty("combat")
    COMBAT("combat"),

    @JsonProperty("woodcutting")
    WOODCUTTING("woodcutting"),

    @JsonProperty("mining")
    MINING("mining"),

    @JsonProperty("fishing")
    FISHING("fishing"),

    @JsonProperty("weaponcrafting")
    WEAPONCRAFTING("weaponcrafting"),

    @JsonProperty("gearcrafting")
    GEARCRAFTING("gearcrafting"),

    @JsonProperty("jewelrycrafting")
    JEWELRYCRAFTING("jewelrycrafting"),

    @JsonProperty("cooking")
    COOKING("cooking"),

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
        fun encode(data: Any?): String? = if (data is CharacterLeaderboardType) "$data" else null

        /**
         * Returns a valid [CharacterLeaderboardType] for [data], null otherwise.
         */
        fun decode(data: Any?): CharacterLeaderboardType? =
            data?.let {
                val normalizedData = "$it".lowercase()
                entries.firstOrNull { value ->
                    it == value || normalizedData == "$value".lowercase()
                }
            }
    }
}
