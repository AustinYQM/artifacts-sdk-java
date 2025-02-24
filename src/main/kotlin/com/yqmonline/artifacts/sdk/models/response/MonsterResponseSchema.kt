
package com.yqmonline.artifacts.sdk.models.response

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.MonsterSchema

/**
 * @param `data`
 */

data class MonsterResponseSchema(
    @JsonProperty("data")
    val `data`: MonsterSchema,
)
