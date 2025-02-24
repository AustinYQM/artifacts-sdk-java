

package com.yqmonline.artifacts.sdk.models.items.recycle

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * @param code Item code.
 * @param quantity Quantity of items to recycle.
 */

data class RecyclingSchema(
    // Item code.
    @JsonProperty("code")
    val code: String,
    // Quantity of items to recycle.
    @JsonProperty("quantity")
    val quantity: Int? = 1,
)
