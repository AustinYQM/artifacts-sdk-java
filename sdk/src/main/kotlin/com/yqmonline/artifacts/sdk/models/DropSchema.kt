

package com.yqmonline.artifacts.sdk.models

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * @param code The code of the item.
 * @param quantity The quantity of the item.
 */

data class DropSchema(
    // The code of the item.
    @JsonProperty("code")
    val code: String,
    // The quantity of the item.
    @JsonProperty("quantity")
    val quantity: Int,
)
