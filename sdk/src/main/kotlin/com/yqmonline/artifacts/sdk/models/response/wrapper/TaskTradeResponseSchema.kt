
package com.yqmonline.artifacts.sdk.models.response.wrapper

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.task.TaskTradeDataSchema

/**
 * @param `data`
 */

data class TaskTradeResponseSchema(
    @JsonProperty("data")
    val `data`: TaskTradeDataSchema,
)
