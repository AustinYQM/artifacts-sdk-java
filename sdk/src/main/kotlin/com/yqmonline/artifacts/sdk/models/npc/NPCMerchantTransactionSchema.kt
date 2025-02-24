package com.yqmonline.artifacts.sdk.models.npc

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.CooldownSchema
import com.yqmonline.artifacts.sdk.models.character.CharacterSchema
import kotlinx.serialization.Serializable

/**
 * @param cooldown Cooldown details.
 * @param transaction Transaction details.
 * @param character Character details.
 */

@Serializable
data class NPCMerchantTransactionSchema(
    // Cooldown details.
    @JsonProperty("cooldown")
    val cooldown: CooldownSchema,
    // Transaction details.
    @JsonProperty("transaction")
    val transaction: NPCItemTransactionSchema,
    // Character details.
    @JsonProperty("character")
    val character: CharacterSchema,
)
