

package com.yqmonline.artifacts.sdk.models.items.ge

import com.fasterxml.jackson.annotation.JsonProperty
import kotlinx.serialization.Serializable

/**
 * @param id Order id.
 * @param quantity Item quantity.
 */

@Serializable
data class GEBuyOrderSchema(
    // Order id.
    @JsonProperty("id")
    val id: String,
    // Item quantity.
    @JsonProperty("quantity")
    val quantity: Int,
)
