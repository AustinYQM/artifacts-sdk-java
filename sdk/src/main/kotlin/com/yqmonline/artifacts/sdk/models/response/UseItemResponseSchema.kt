
package com.yqmonline.artifacts.sdk.models.response

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.UseItemSchema

/**
 * @param `data`
 */

data class UseItemResponseSchema(
    @JsonProperty("data")
    val `data`: UseItemSchema,
)
