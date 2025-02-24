
package com.yqmonline.artifacts.sdk.models

import com.fasterxml.jackson.annotation.JsonProperty

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
