
package com.yqmonline.artifacts.sdk.models

import com.fasterxml.jackson.annotation.JsonProperty

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
