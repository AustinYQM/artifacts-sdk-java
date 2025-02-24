
package com.yqmonline.artifacts.sdk.models

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * @param cooldown Cooldown details.
 * @param order Order details.
 * @param character Character details.
 */

data class GEOrderTransactionSchema(
    // Cooldown details.
    @JsonProperty("cooldown")
    val cooldown: CooldownSchema,
    // Order details.
    @JsonProperty("order")
    val order: GEOrderCreatedSchema,
    // Character details.
    @JsonProperty("character")
    val character: CharacterSchema,
)
