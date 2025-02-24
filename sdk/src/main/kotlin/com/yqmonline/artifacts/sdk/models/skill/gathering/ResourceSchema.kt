
package com.yqmonline.artifacts.sdk.models.skill.gathering

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.enums.GatheringSkill
import com.yqmonline.artifacts.sdk.models.items.DropRateSchema
import kotlinx.serialization.Serializable

/**
 * @param name The name of the resource
 * @param code The code of the resource. This is the resource's unique identifier (ID).
 * @param skill The skill required to gather this resource.
 * @param level The skill level required to gather this resource.
 * @param drops The drops of this resource.
 */

@Serializable
data class ResourceSchema(
    // The name of the resource
    @JsonProperty("name")
    val name: String,
    // The code of the resource. This is the resource's unique identifier (ID).
    @JsonProperty("code")
    val code: String,
    // The skill required to gather this resource.
    @JsonProperty("skill")
    val skill: GatheringSkill,
    // The skill level required to gather this resource.
    @JsonProperty("level")
    val level: Int,
    // The drops of this resource.
    @JsonProperty("drops")
    val drops: List<DropRateSchema>,
)
