
package com.yqmonline.artifacts.sdk.models.items.recycle

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.CooldownSchema
import com.yqmonline.artifacts.sdk.models.character.CharacterSchema

/**
 * @param cooldown Cooldown details.
 * @param details Craft details.
 * @param character Player details.
 */

data class RecyclingDataSchema(
    // Cooldown details.
    @JsonProperty("cooldown")
    val cooldown: CooldownSchema,
    // Craft details.
    @JsonProperty("details")
    val details: RecyclingItemsSchema,
    // Player details.
    @JsonProperty("character")
    val character: CharacterSchema,
)
