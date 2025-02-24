
package com.yqmonline.artifacts.sdk.models

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.enums.ItemSlot

/**
 * @param cooldown Cooldown details.
 * @param slot Item slot.
 * @param item Item details.
 * @param character Player details.
 */

data class EquipRequestSchema(
    // Cooldown details.
    @JsonProperty("cooldown")
    val cooldown: CooldownSchema,
    // Item slot.
    @JsonProperty("slot")
    val slot: ItemSlot,
    // Item details.
    @JsonProperty("item")
    val item: ItemSchema,
    // Player details.
    @JsonProperty("character")
    val character: CharacterSchema,
)
