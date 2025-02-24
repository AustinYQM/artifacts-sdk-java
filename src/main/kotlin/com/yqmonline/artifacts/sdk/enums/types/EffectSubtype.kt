
package com.yqmonline.artifacts.sdk.enums.types

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Values: stat,other,heal,buff,debuff,special,gathering,teleport,gold
 */

enum class EffectSubtype(
    private val value: String,
) {
    @JsonProperty("stat")
    STAT("stat"),

    @JsonProperty("other")
    OTHER("other"),

    @JsonProperty("heal")
    HEAL("heal"),

    @JsonProperty("buff")
    BUFF("buff"),

    @JsonProperty("debuff")
    DEBUFF("debuff"),

    @JsonProperty("special")
    SPECIAL("special"),

    @JsonProperty("gathering")
    GATHERING("gathering"),

    @JsonProperty("teleport")
    TELEPORT("teleport"),

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
    override fun toString(): String = value

    companion object {
        /**
         * Converts the provided [data] to a [String] on success, null otherwise.
         */
        fun encode(data: Any?): String? = if (data is EffectSubtype) "$data" else null

        /**
         * Returns a valid [EffectSubtype] for [data], null otherwise.
         */
        fun decode(data: Any?): EffectSubtype? =
            data?.let {
                val normalizedData = "$it".lowercase()
                entries.firstOrNull { value ->
                    it == value || normalizedData == "$value".lowercase()
                }
            }
    }
}
