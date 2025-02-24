
package com.yqmonline.artifacts.sdk.models.items.equip

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.CooldownSchema
import com.yqmonline.artifacts.sdk.models.character.CharacterSchema
import com.yqmonline.artifacts.sdk.models.enums.ItemSlot
import com.yqmonline.artifacts.sdk.models.items.ItemSchema
import kotlinx.serialization.Serializable

/**
 * @param cooldown Cooldown details.
 * @param slot Item slot.
 * @param item Item details.
 * @param character Player details.
 */

@Serializable
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
