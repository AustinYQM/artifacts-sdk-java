
package com.yqmonline.artifacts.sdk.models

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * @param xp The amount of xp gained.
 * @param items Objects received.
 */

data class SkillInfoSchema(
    // The amount of xp gained.
    @JsonProperty("xp")
    val xp: Int,
    // Objects received.
    @JsonProperty("items")
    val items: List<DropSchema>,
)
