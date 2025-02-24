
package com.yqmonline.artifacts.sdk.models.map

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * @param name Name of the map.
 * @param skin Skin of the map.
 * @param x Position X of the map.
 * @param y Position Y of the map.
 * @param content
 */

data class MapSchema(
    // Name of the map.
    @JsonProperty("name")
    val name: String,
    // Skin of the map.
    @JsonProperty("skin")
    val skin: String,
    // Position X of the map.
    @JsonProperty("x")
    val x: Int,
    // Position Y of the map.
    @JsonProperty("y")
    val y: Int,
    @JsonProperty("content")
    val content: MapContentSchema?,
)
