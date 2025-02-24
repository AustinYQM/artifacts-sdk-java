
package com.yqmonline.artifacts.sdk.models.task

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.items.SimpleItemSchema
import kotlinx.serialization.Serializable

/**
 * @param items Items rewards.
 * @param gold Gold rewards.
 */

@Serializable
data class RewardsSchema(
    // Items rewards.
    @JsonProperty("items")
    val items: List<SimpleItemSchema>,
    // Gold rewards.
    @JsonProperty("gold")
    val gold: Int,
)
