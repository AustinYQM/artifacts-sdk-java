

package com.yqmonline.artifacts.sdk.models.items.inventory

import com.fasterxml.jackson.annotation.JsonProperty
import kotlinx.serialization.Serializable

/**
 * @param code The code of the item.
 * @param quantity The quantity of the item.
 */

@Serializable
data class DropSchema(
    // The code of the item.
    @JsonProperty("code")
    val code: String,
    // The quantity of the item.
    @JsonProperty("quantity")
    val quantity: Int,
)
