
package com.yqmonline.artifacts.sdk.models.response.wrapper

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.skill.SkillDataSchema
import kotlinx.serialization.Serializable

/**
 * @param `data`
 */

@Serializable
data class SkillResponseSchema(
    @JsonProperty("data")
    val `data`: SkillDataSchema,
)
