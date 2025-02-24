
package com.yqmonline.artifacts.sdk.models.items.inventory

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.CooldownSchema
import com.yqmonline.artifacts.sdk.models.character.CharacterSchema
import com.yqmonline.artifacts.sdk.models.items.ItemSchema

/**
 * @param cooldown Cooldown details.
 * @param item Item details.
 * @param character Player details.
 */

data class UseItemSchema(
    // Cooldown details.
    @JsonProperty("cooldown")
    val cooldown: CooldownSchema,
    // Item details.
    @JsonProperty("item")
    val item: ItemSchema,
    // Player details.
    @JsonProperty("character")
    val character: CharacterSchema,
)
