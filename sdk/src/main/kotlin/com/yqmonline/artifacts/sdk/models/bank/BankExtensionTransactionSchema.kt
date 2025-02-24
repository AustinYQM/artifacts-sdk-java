package com.yqmonline.artifacts.sdk.models.bank

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.CooldownSchema
import com.yqmonline.artifacts.sdk.models.character.CharacterSchema

/**
 * @param cooldown Cooldown details.
 * @param transaction Transaction details.
 * @param character Player details.
 */

data class BankExtensionTransactionSchema(
    // Cooldown details.
    @JsonProperty("cooldown")
    val cooldown: CooldownSchema,
    // Transaction details.
    @JsonProperty("transaction")
    val transaction: BankExtensionSchema,
    // Player details.
    @JsonProperty("character")
    val character: CharacterSchema,
)
