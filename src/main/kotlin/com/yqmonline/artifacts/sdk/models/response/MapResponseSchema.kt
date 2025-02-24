
package com.yqmonline.artifacts.sdk.models.response

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.MapSchema

/**
 * @param `data`
 */

data class MapResponseSchema(
    @JsonProperty("data")
    val `data`: MapSchema,
)
