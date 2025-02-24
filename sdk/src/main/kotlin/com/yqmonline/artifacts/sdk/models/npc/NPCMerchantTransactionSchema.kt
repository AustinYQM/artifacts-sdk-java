package com.yqmonline.artifacts.sdk.models.npc

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.CooldownSchema
import com.yqmonline.artifacts.sdk.models.character.CharacterSchema

/**
 * @param cooldown Cooldown details.
 * @param transaction Transaction details.
 * @param character Character details.
 */

data class NPCMerchantTransactionSchema(
    // Cooldown details.
    @JsonProperty("cooldown")
    val cooldown: CooldownSchema,
    // Transaction details.
    @JsonProperty("transaction")
    val transaction: NpcItemTransactionSchema,
    // Character details.
    @JsonProperty("character")
    val character: CharacterSchema,
)
