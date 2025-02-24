

package com.yqmonline.artifacts.sdk.models.map

import com.fasterxml.jackson.annotation.JsonProperty
import kotlinx.serialization.Serializable

/**
 * @param x The x coordinate of the destination.
 * @param y The y coordinate of the destination.
 */

@Serializable
data class DestinationSchema(
    // The x coordinate of the destination.
    @JsonProperty("x")
    val x: Int,
    // The y coordinate of the destination.
    @JsonProperty("y")
    val y: Int,
)
