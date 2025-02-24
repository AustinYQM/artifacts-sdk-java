
package com.yqmonline.artifacts.sdk.models

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.enums.ItemSlot

/**
 * @param slot Item slot.
 * @param quantity Item quantity. Applicable to utilities only.
 */

data class UnequipSchema(
    // Item slot.
    @JsonProperty("slot")
    val slot: ItemSlot,
    // Item quantity. Applicable to utilities only.
    @JsonProperty("quantity")
    val quantity: Int? = 1,
)
