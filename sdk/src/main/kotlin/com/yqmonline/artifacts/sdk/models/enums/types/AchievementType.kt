package com.yqmonline.artifacts.sdk.models.enums.types

import com.fasterxml.jackson.annotation.JsonProperty

enum class AchievementType(
    private val value: kotlin.String,
) {
    @JsonProperty("combat_kill")
    COMBAT_KILL("combat_kill"),

    @JsonProperty("combat_drop")
    COMBAT_DROP("combat_drop"),

    @JsonProperty("combat_level")
    COMBAT_LEVEL("combat_level"),

    @JsonProperty("gathering")
    GATHERING("gathering"),

    @JsonProperty("crafting")
    CRAFTING("crafting"),

    @JsonProperty("recycling")
    RECYCLING("recycling"),

    @JsonProperty("task")
    TASK("task"),

    @JsonProperty("other")
    OTHER("other"),

    @JsonProperty("use")
    USE("use"),
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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is AchievementType) "$data" else null

        /**
         * Returns a valid [AchievementType] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): AchievementType? =
            data?.let {
                val normalizedData = "$it".lowercase()
                entries.firstOrNull { value ->
                    it == value || normalizedData == "$value".lowercase()
                }
            }
    }
}
