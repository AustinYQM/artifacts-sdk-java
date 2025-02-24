package com.yqmonline.artifacts.sdk.models

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * @param code Code of the condition.
 * @param quantity
 */

data class BadgeConditionSchema(
    // Code of the condition.
    @JsonProperty("code")
    val code: String,
    @JsonProperty("quantity")
    val quantity: Int? = 0,
)
