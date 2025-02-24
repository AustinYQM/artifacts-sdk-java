
package com.yqmonline.artifacts.sdk.models.response

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.ItemSchema

/**
 * @param `data`
 */

data class ItemResponseSchema(
    @JsonProperty("data")
    val `data`: ItemSchema,
)
