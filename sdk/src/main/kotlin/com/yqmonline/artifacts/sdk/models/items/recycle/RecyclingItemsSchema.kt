
package com.yqmonline.artifacts.sdk.models.items.recycle

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.items.inventory.DropSchema

/**
 * @param items Objects received.
 */

data class RecyclingItemsSchema(
    // Objects received.
    @JsonProperty("items")
    val items: List<DropSchema>,
)
