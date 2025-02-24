

package com.yqmonline.artifacts.sdk.models.items

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * @param code Item code.
 * @param quantity Item quantity.
 */

data class SimpleItemSchema(
    // Item code.
    @JsonProperty("code")
    val code: String,
    // Item quantity.
    @JsonProperty("quantity")
    val quantity: Int,
)
