package com.yqmonline.artifacts.sdk.models.bank

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.CooldownSchema
import com.yqmonline.artifacts.sdk.models.character.CharacterSchema
import com.yqmonline.artifacts.sdk.models.items.ItemSchema
import com.yqmonline.artifacts.sdk.models.items.SimpleItemSchema

/**
 * @param cooldown Cooldown details.
 * @param item Item details.
 * @param bank Items in your banks.
 * @param character Player details.
 */

data class BankItemTransactionSchema(
    // Cooldown details.
    @JsonProperty("cooldown")
    val cooldown: CooldownSchema,
    // Item details.
    @JsonProperty("item")
    val item: ItemSchema,
    // Items in your banks.
    @JsonProperty("bank")
    val bank: List<SimpleItemSchema>,
    // Player details.
    @JsonProperty("character")
    val character: CharacterSchema,
)
