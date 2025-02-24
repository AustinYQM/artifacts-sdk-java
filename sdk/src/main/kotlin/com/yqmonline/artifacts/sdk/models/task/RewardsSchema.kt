
package com.yqmonline.artifacts.sdk.models.task

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.items.SimpleItemSchema

/**
 * @param items Items rewards.
 * @param gold Gold rewards.
 */

data class RewardsSchema(
    // Items rewards.
    @JsonProperty("items")
    val items: List<SimpleItemSchema>,
    // Gold rewards.
    @JsonProperty("gold")
    val gold: Int,
)
