package com.yqmonline.artifacts.sdk.models.account.badge

import com.fasterxml.jackson.annotation.JsonProperty
import kotlinx.serialization.Serializable

/**
 * @param code Code of the condition.
 * @param quantity
 */

@Serializable
data class BadgeConditionSchema(
    // Code of the condition.
    @JsonProperty("code")
    val code: String,
    @JsonProperty("quantity")
    val quantity: Int? = 0,
)
