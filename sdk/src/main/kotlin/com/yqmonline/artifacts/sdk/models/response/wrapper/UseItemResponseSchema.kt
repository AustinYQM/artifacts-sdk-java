
package com.yqmonline.artifacts.sdk.models.response.wrapper

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.items.inventory.UseItemSchema

/**
 * @param `data`
 */

data class UseItemResponseSchema(
    @JsonProperty("data")
    val `data`: UseItemSchema,
)
