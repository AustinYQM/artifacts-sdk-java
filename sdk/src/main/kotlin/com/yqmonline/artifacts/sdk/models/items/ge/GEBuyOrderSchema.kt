

package com.yqmonline.artifacts.sdk.models.items.ge

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * @param id Order id.
 * @param quantity Item quantity.
 */

data class GEBuyOrderSchema(
    // Order id.
    @JsonProperty("id")
    val id: String,
    // Item quantity.
    @JsonProperty("quantity")
    val quantity: Int,
)
