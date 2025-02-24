

package com.yqmonline.artifacts.sdk.models.event

import com.fasterxml.jackson.annotation.JsonProperty
import kotlinx.serialization.Serializable

/**
 * @param x Position X of the map.
 * @param y Position Y of the map.
 */

@Serializable
data class EventMapSchema(
    // Position X of the map.
    @JsonProperty("x")
    val x: Int,
    // Position Y of the map.
    @JsonProperty("y")
    val y: Int,
)
