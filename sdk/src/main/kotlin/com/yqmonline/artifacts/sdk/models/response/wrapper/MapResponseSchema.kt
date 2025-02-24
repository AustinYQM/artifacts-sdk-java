
package com.yqmonline.artifacts.sdk.models.response.wrapper

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.map.MapSchema

/**
 * @param `data`
 */

data class MapResponseSchema(
    @JsonProperty("data")
    val `data`: MapSchema,
)
