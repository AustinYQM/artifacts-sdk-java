
package com.yqmonline.artifacts.sdk.models.items.ge

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.CooldownSchema
import com.yqmonline.artifacts.sdk.models.character.CharacterSchema

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
