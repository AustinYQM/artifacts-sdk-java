
package com.yqmonline.artifacts.sdk.models.response.wrapper

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.items.recycle.RecyclingDataSchema

/**
 * @param `data`
 */

data class RecyclingResponseSchema(
    @JsonProperty("data")
    val `data`: RecyclingDataSchema,
)
