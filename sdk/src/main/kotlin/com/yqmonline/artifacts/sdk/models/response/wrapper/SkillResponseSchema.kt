
package com.yqmonline.artifacts.sdk.models.response.wrapper

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.skill.SkillDataSchema

/**
 * @param `data`
 */

data class SkillResponseSchema(
    @JsonProperty("data")
    val `data`: SkillDataSchema,
)
