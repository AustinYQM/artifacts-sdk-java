
package com.yqmonline.artifacts.sdk.models.response.wrapper

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.map.MapSchema
import kotlinx.serialization.Serializable

/**
 * @param `data`
 */

@Serializable
data class MapResponseSchema(
    @JsonProperty("data")
    val `data`: MapSchema,
)
