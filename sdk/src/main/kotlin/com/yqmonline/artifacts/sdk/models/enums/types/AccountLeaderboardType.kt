package com.yqmonline.artifacts.sdk.models.enums.types

import com.fasterxml.jackson.annotation.JsonProperty
import kotlinx.serialization.Serializable

/**
 * Values: achievements_points,gold
 */
@Serializable
enum class AccountLeaderboardType(
    private val value: String,
) {
    @JsonProperty("achievements_points")
    ACHIEVEMENTS_POINTS("achievements_points"),

    @JsonProperty("gold")
    GOLD("gold"),
    ;

    /**
     * Override [toString()] to avoid using the enum variable name as the value, and instead use
     * the actual value defined in the API spec file.
     *
     * This solves a problem when the variable name and its value are different, and ensures that
     * the client sends the correct enum values to the server always.
     */
    override fun toString(): kotlin.String = value

    companion object {
        /**
         * Converts the provided [data] to a [String] on success, null otherwise.
         */
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is AccountLeaderboardType) "$data" else null

        /**
         * Returns a valid [AccountLeaderboardType] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): AccountLeaderboardType? =
            data?.let {
                val normalizedData = "$it".lowercase()
                entries.firstOrNull { value ->
                    it == value || normalizedData == "$value".lowercase()
                }
            }
    }
}
