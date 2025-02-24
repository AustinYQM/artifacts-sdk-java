
package com.yqmonline.artifacts.sdk.models

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * @param name Item name.
 * @param code Item code. This is the item's unique identifier (ID).
 * @param level Item level.
 * @param type Item type.
 * @param subtype Item subtype.
 * @param description Item description.
 * @param tradeable Item tradeable status. A non-tradeable item cannot be exchanged or sold.
 * @param effects List of object effects. For equipment, it will include item stats.
 * @param craft
 */

data class ItemSchema(
    // Item name.
    @JsonProperty("name")
    val name: String,
    // Item code. This is the item's unique identifier (ID).
    @JsonProperty("code")
    val code: String,
    // Item level.
    @JsonProperty("level")
    val level: Int,
    // Item type.
    @JsonProperty("type")
    val type: String,
    // Item subtype.
    @JsonProperty("subtype")
    val subtype: String,
    // Item description.
    @JsonProperty("description")
    val description: String,
    // Item tradeable status. A non-tradeable item cannot be exchanged or sold.
    @JsonProperty("tradeable")
    val tradeable: Boolean,
    // List of object effects. For equipment, it will include item stats.
    @JsonProperty("effects")
    val effects: List<SimpleEffectSchema>? = null,
    @JsonProperty("craft")
    val craft: CraftSchema? = null,
)
