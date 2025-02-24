package com.yqmonline.artifacts.sdk.models

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * @param fire The amount of fire hits blocked.
 * @param earth The amount of earth hits blocked.
 * @param water The amount of water hits blocked.
 * @param air The amount of air hits blocked.
 * @param total The amount of total hits blocked.
 */

data class BlockedHitsSchema(
    // The amount of fire hits blocked.
    @JsonProperty("fire")
    val fire: Int,
    // The amount of earth hits blocked.
    @JsonProperty("earth")
    val earth: Int,
    // The amount of water hits blocked.
    @JsonProperty("water")
    val water: Int,
    // The amount of air hits blocked.
    @JsonProperty("air")
    val air: Int,
    // The amount of total hits blocked.
    @JsonProperty("total")
    val total: Int,
)
