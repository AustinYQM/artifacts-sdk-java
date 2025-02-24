

package com.yqmonline.artifacts.sdk.models.items.inventory

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * @param slot Inventory slot identifier.
 * @param code Item code.
 * @param quantity Quantity in the slot.
 */

data class InventorySlot(
    // Inventory slot identifier.
    @JsonProperty("slot")
    val slot: Int,
    // Item code.
    @JsonProperty("code")
    val code: String,
    // Quantity in the slot.
    @JsonProperty("quantity")
    val quantity: Int,
)
