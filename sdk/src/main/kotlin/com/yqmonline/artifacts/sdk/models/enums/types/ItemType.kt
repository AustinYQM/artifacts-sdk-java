
package com.yqmonline.artifacts.sdk.models.enums.types

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Values: utility,body_armor,weapon,resource,leg_armor,helmet,boots,shield,amulet,ring,artifact,currency,consumable,rune,bag
 */

enum class ItemType(
    private val value: String,
) {
    @JsonProperty("utility")
    UTILITY("utility"),

    @JsonProperty("body_armor")
    BODY_ARMOR("body_armor"),

    @JsonProperty("weapon")
    WEAPON("weapon"),

    @JsonProperty("resource")
    RESOURCE("resource"),

    @JsonProperty("leg_armor")
    LEG_ARMOR("leg_armor"),

    @JsonProperty("helmet")
    HELMET("helmet"),

    @JsonProperty("boots")
    BOOTS("boots"),

    @JsonProperty("shield")
    SHIELD("shield"),

    @JsonProperty("amulet")
    AMULET("amulet"),

    @JsonProperty("ring")
    RING("ring"),

    @JsonProperty("artifact")
    ARTIFACT("artifact"),

    @JsonProperty("currency")
    CURRENCY("currency"),

    @JsonProperty("consumable")
    CONSUMABLE("consumable"),

    @JsonProperty("rune")
    RUNE("rune"),

    @JsonProperty("bag")
    BAG("bag"),
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
        fun encode(data: Any?): String? = if (data is ItemType) "$data" else null

        /**
         * Returns a valid [ItemType] for [data], null otherwise.
         */
        fun decode(data: Any?): ItemType? =
            data?.let {
                val normalizedData = "$it".lowercase()
                entries.firstOrNull { value ->
                    it == value || normalizedData == "$value".lowercase()
                }
            }
    }
}
