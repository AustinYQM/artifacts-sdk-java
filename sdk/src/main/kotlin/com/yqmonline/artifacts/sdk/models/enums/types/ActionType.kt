package com.yqmonline.artifacts.sdk.models.enums.types

import com.fasterxml.jackson.annotation.JsonProperty
import kotlinx.serialization.Serializable

@Serializable
enum class ActionType(
    private val value: String,
) {
    @JsonProperty("movement")
    MOVEMENT("movement"),

    @JsonProperty("fight")
    FIGHT("fight"),

    @JsonProperty("crafting")
    CRAFTING("crafting"),

    @JsonProperty("gathering")
    GATHERING("gathering"),

    @JsonProperty("buy_ge")
    BUY_GE("buy_ge"),

    @JsonProperty("sell_ge")
    SELL_GE("sell_ge"),

    @JsonProperty("buy_npc")
    BUY_NPC("buy_npc"),

    @JsonProperty("sell_npc")
    SELL_NPC("sell_npc"),

    @JsonProperty("cancel_ge")
    CANCEL_GE("cancel_ge"),

    @JsonProperty("delete_item")
    DELETE_ITEM("delete_item"),

    @JsonProperty("deposit")
    DEPOSIT("deposit"),

    @JsonProperty("withdraw")
    WITHDRAW("withdraw"),

    @JsonProperty("deposit_gold")
    DEPOSIT_GOLD("deposit_gold"),

    @JsonProperty("withdraw_gold")
    WITHDRAW_GOLD("withdraw_gold"),

    @JsonProperty("equip")
    EQUIP("equip"),

    @JsonProperty("unequip")
    UNEQUIP("unequip"),

    @JsonProperty("task")
    TASK("task"),

    @JsonProperty("christmas_exchange")
    CHRISTMAS_EXCHANGE("christmas_exchange"),

    @JsonProperty("recycling")
    RECYCLING("recycling"),

    @JsonProperty("rest")
    REST("rest"),

    @JsonProperty("use")
    USE("use"),

    @JsonProperty("buy_bank_expansion")
    BUY_BANK_EXPANSION("buy_bank_expansion"),
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
        fun encode(data: Any?): String? = if (data is ActionType) "$data" else null

        /**
         * Returns a valid [ActionType] for [data], null otherwise.
         */
        fun decode(data: Any?): ActionType? =
            data?.let {
                val normalizedData = "$it".lowercase()
                entries.firstOrNull { value ->
                    it == value || normalizedData == "$value".lowercase()
                }
            }
    }
}
