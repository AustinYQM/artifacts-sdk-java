package com.yqmonline.artifacts.sdk.models.skill.crafting

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * @param code Craft code.
 * @param quantity Quantity of items to craft.
 */

data class CraftingSchema(
    // Craft code.
    @JsonProperty("code")
    val code: String,
    // Quantity of items to craft.
    @JsonProperty("quantity")
    val quantity: Int? = 1,
)
