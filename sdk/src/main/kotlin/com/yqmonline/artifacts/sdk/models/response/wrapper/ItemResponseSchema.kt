
package com.yqmonline.artifacts.sdk.models.response.wrapper

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.items.ItemSchema

/**
 * @param `data`
 */

data class ItemResponseSchema(
    @JsonProperty("data")
    val `data`: ItemSchema,
)
