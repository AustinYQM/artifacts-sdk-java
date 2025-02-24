
package com.yqmonline.artifacts.sdk.models

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * @param cooldown Cooldown details.
 * @param transaction Transaction details.
 * @param character Character details.
 */

data class NpcMerchantTransactionSchema(
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
