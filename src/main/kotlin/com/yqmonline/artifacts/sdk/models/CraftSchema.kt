package com.yqmonline.artifacts.sdk.models
import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.enums.CraftSkill

/**
 * @param skill Skill required to craft the item.
 * @param level The skill level required to craft the item.
 * @param items List of items required to craft the item.
 * @param quantity Quantity of items crafted.
 */

data class CraftSchema(
    // Skill required to craft the item.
    @JsonProperty("skill")
    val skill: CraftSkill? = null,
    // The skill level required to craft the item.
    @JsonProperty("level")
    val level: Int? = null,
    // List of items required to craft the item.
    @JsonProperty("items")
    val items: List<SimpleItemSchema>? = null,
    // Quantity of items crafted.
    @JsonProperty("quantity")
    val quantity: Int? = null,
)
