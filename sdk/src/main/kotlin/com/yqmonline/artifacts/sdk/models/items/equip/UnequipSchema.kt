
package com.yqmonline.artifacts.sdk.models.items.equip

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.enums.ItemSlot
import kotlinx.serialization.Serializable

/**
 * @param slot Item slot.
 * @param quantity Item quantity. Applicable to utilities only.
 */

@Serializable
data class UnequipSchema(
    // Item slot.
    @JsonProperty("slot")
    val slot: ItemSlot,
    // Item quantity. Applicable to utilities only.
    @JsonProperty("quantity")
    val quantity: Int? = 1,
)
