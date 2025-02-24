

package com.yqmonline.artifacts.sdk.models.task

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * @param code Item code.
 * @param quantity Item quantity.
 */

data class TaskTradeSchema(
    // Item code.
    @JsonProperty("code")
    val code: String,
    // Item quantity.
    @JsonProperty("quantity")
    val quantity: Int,
)
