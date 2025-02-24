package com.yqmonline.artifacts.sdk.models.response.wrapper

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.items.inventory.DeleteItemSchema

/**
 * @param `data`
 */

data class DeleteItemResponseSchema(
    @JsonProperty("data")
    val `data`: DeleteItemSchema,
)
