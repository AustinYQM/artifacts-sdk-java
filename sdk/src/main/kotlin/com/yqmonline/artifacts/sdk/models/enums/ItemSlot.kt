
package com.yqmonline.artifacts.sdk.models.enums

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Values: weapon,shield,helmet,body_armor,leg_armor,boots,ring1,ring2,amulet,artifact1,artifact2,artifact3,utility1,utility2,bag,rune
 */

enum class ItemSlot(
    private val value: String,
) {
    @JsonProperty("weapon")
    WEAPON("weapon"),

    @JsonProperty("shield")
    SHIELD("shield"),

    @JsonProperty("helmet")
    HELMET("helmet"),

    @JsonProperty("body_armor")
    BODY_ARMOR("body_armor"),

    @JsonProperty("leg_armor")
    LEG_ARMOR("leg_armor"),

    @JsonProperty("boots")
    BOOTS("boots"),

    @JsonProperty("ring1")
    RING1("ring1"),

    @JsonProperty("ring2")
    RING2("ring2"),

    @JsonProperty("amulet")
    AMULET("amulet"),

    @JsonProperty("artifact1")
    ARTIFACT1("artifact1"),

    @JsonProperty("artifact2")
    ARTIFACT2("artifact2"),

    @JsonProperty("artifact3")
    ARTIFACT3("artifact3"),

    @JsonProperty("utility1")
    UTILITY1("utility1"),

    @JsonProperty("utility2")
    UTILITY2("utility2"),

    @JsonProperty("bag")
    BAG("bag"),

    @JsonProperty("rune")
    RUNE("rune"),
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
        fun encode(data: Any?): String? = if (data is ItemSlot) "$data" else null

        /**
         * Returns a valid [ItemSlot] for [data], null otherwise.
         */
        fun decode(data: Any?): ItemSlot? =
            data?.let {
                val normalizedData = "$it".lowercase()
                entries.firstOrNull { value ->
                    it == value || normalizedData == "$value".lowercase()
                }
            }
    }
}
