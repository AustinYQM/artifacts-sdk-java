

package com.yqmonline.artifacts.sdk.models

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * @param x The x coordinate of the destination.
 * @param y The y coordinate of the destination.
 */

data class DestinationSchema(
    // The x coordinate of the destination.
    @JsonProperty("x")
    val x: Int,
    // The y coordinate of the destination.
    @JsonProperty("y")
    val y: Int,
)
