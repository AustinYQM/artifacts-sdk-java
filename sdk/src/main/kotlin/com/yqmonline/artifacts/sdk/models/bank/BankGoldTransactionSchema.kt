package com.yqmonline.artifacts.sdk.models.bank

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.CooldownSchema
import com.yqmonline.artifacts.sdk.models.character.CharacterSchema
import com.yqmonline.artifacts.sdk.models.items.GoldSchema
import kotlinx.serialization.Serializable

/**
 * @param cooldown Cooldown details.
 * @param bank Bank details.
 * @param character Player details.
 */

@Serializable
data class BankGoldTransactionSchema(
    // Cooldown details.
    @JsonProperty("cooldown")
    val cooldown: CooldownSchema,
    // Bank details.
    @JsonProperty("bank")
    val bank: GoldSchema,
    // Player details.
    @JsonProperty("character")
    val character: CharacterSchema,
)
