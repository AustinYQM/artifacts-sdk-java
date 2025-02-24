
package com.yqmonline.artifacts.sdk.models.enums.types

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Values: spawn,movement,fight,crafting,gathering,buy_ge,sell_ge,buy_npc,sell_npc,cancel_ge,delete_item,deposit,withdraw,deposit_gold,withdraw_gold,equip,unequip,new_task,task_exchange,task_cancelled,task_completed,task_trade,christmas_exchange,recycling,rest,use,buy_bank_expansion,achievement
 */

enum class LogType(
    private val value: String,
) {
    @JsonProperty("spawn")
    SPAWN("spawn"),

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

    @JsonProperty("new_task")
    NEW_TASK("new_task"),

    @JsonProperty("task_exchange")
    TASK_EXCHANGE("task_exchange"),

    @JsonProperty("task_cancelled")
    TASK_CANCELLED("task_cancelled"),

    @JsonProperty("task_completed")
    TASK_COMPLETED("task_completed"),

    @JsonProperty("task_trade")
    TASK_TRADE("task_trade"),

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

    @JsonProperty("achievement")
    ACHIEVEMENT("achievement"),
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
        fun encode(data: Any?): String? = if (data is LogType) "$data" else null

        /**
         * Returns a valid [LogType] for [data], null otherwise.
         */
        fun decode(data: Any?): LogType? =
            data?.let {
                val normalizedData = "$it".lowercase()
                entries.firstOrNull { value ->
                    it == value || normalizedData == "$value".lowercase()
                }
            }
    }
}
