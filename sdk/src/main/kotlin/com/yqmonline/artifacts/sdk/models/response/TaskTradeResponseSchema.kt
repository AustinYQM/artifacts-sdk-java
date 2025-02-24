
package com.yqmonline.artifacts.sdk.models.response

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.TaskTradeDataSchema

/**
 * @param `data`
 */

data class TaskTradeResponseSchema(
    @JsonProperty("data")
    val `data`: TaskTradeDataSchema,
)
