
package com.yqmonline.artifacts.sdk.models.response

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.RecyclingDataSchema

/**
 * @param `data`
 */

data class RecyclingResponseSchema(
    @JsonProperty("data")
    val `data`: RecyclingDataSchema,
)
