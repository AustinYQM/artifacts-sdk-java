
package com.yqmonline.artifacts.sdk.models.skill

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.items.inventory.DropSchema
import kotlinx.serialization.Serializable

/**
 * @param xp The amount of xp gained.
 * @param items Objects received.
 */

@Serializable
data class SkillInfoSchema(
    // The amount of xp gained.
    @JsonProperty("xp")
    val xp: Int,
    // Objects received.
    @JsonProperty("items")
    val items: List<DropSchema>,
)
