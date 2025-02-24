
package com.yqmonline.artifacts.sdk.models

import com.fasterxml.jackson.annotation.JsonProperty

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
