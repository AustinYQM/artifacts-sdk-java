
package com.yqmonline.artifacts.sdk.models

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * @param cooldown Cooldown details.
 * @param order Transaction details.
 * @param character Character details.
 */

data class GETransactionListSchema(
    // Cooldown details.
    @JsonProperty("cooldown")
    val cooldown: CooldownSchema,
    // Transaction details.
    @JsonProperty("order")
    val order: GETransactionSchema,
    // Character details.
    @JsonProperty("character")
    val character: CharacterSchema,
)
