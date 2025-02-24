
package com.yqmonline.artifacts.sdk.models.items.recycle

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.items.inventory.DropSchema
import kotlinx.serialization.Serializable

/**
 * @param items Objects received.
 */

@Serializable
data class RecyclingItemsSchema(
    // Objects received.
    @JsonProperty("items")
    val items: List<DropSchema>,
)
