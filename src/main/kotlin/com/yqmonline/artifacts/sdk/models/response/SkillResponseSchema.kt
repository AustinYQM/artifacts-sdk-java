
package com.yqmonline.artifacts.sdk.models.response

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.SkillDataSchema

/**
 * @param `data`
 */

data class SkillResponseSchema(
    @JsonProperty("data")
    val `data`: SkillDataSchema,
)
