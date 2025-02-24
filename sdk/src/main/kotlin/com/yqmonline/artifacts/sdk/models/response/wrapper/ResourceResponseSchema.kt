
package com.yqmonline.artifacts.sdk.models.response.wrapper

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.skill.gathering.ResourceSchema
import kotlinx.serialization.Serializable

/**
 * @param `data`
 */

@Serializable
data class ResourceResponseSchema(
    @JsonProperty("data")
    val `data`: ResourceSchema,
)
