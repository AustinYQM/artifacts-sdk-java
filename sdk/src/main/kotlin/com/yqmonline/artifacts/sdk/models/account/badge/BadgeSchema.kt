package com.yqmonline.artifacts.sdk.models.account.badge

import com.fasterxml.jackson.annotation.JsonProperty
import kotlinx.serialization.Serializable

/**
 * @param code Code of the badge. This is the badge's unique identifier (ID).
 * @param description Description of the badge.
 * @param conditions Conditions to get the badge.
 * @param season
 */

@Serializable
data class BadgeSchema(
    // Code of the badge. This is the badge's unique identifier (ID).
    @JsonProperty("code")
    val code: String,
    // Description of the badge.
    @JsonProperty("description")
    val description: String,
    // Conditions to get the badge.
    @JsonProperty("conditions")
    val conditions: List<BadgeConditionSchema>,
    @JsonProperty("season")
    val season: Int? = null,
)
