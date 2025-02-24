package com.yqmonline.artifacts.sdk.models.response

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.DeleteItemSchema

/**
 * @param `data`
 */

data class DeleteItemResponseSchema(
    @JsonProperty("data")
    val `data`: DeleteItemSchema,
)
