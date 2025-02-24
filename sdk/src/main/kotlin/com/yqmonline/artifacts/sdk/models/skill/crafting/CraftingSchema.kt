package com.yqmonline.artifacts.sdk.models.skill.crafting

import com.fasterxml.jackson.annotation.JsonProperty
import kotlinx.serialization.Serializable

/**
 * @param code Craft code.
 * @param quantity Quantity of items to craft.
 */

@Serializable
data class CraftingSchema(
    // Craft code.
    @JsonProperty("code")
    val code: String,
    // Quantity of items to craft.
    @JsonProperty("quantity")
    val quantity: Int? = 1,
)
