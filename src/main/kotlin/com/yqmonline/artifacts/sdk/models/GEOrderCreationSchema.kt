

package com.yqmonline.artifacts.sdk.models

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * @param code Item code.
 * @param quantity Item quantity.
 * @param price Item price per unit.
 */

data class GEOrderCreationSchema(
    // Item code.
    @JsonProperty("code")
    val code: String,
    // Item quantity.
    @JsonProperty("quantity")
    val quantity: Int,
    // Item price per unit.
    @JsonProperty("price")
    val price: Int,
)
