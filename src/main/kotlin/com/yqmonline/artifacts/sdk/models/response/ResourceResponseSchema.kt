
package com.yqmonline.artifacts.sdk.models.response

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.ResourceSchema

/**
 * @param `data`
 */

data class ResourceResponseSchema(
    @JsonProperty("data")
    val `data`: ResourceSchema,
)
