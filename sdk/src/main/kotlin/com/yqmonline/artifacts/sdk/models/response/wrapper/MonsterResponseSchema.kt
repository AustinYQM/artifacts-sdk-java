
package com.yqmonline.artifacts.sdk.models.response.wrapper

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.MonsterSchema
import kotlinx.serialization.Serializable

/**
 * @param `data`
 */

@Serializable
data class MonsterResponseSchema(
    @JsonProperty("data")
    val `data`: MonsterSchema,
)
