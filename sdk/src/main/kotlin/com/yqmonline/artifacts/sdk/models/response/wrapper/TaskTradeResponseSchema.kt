
package com.yqmonline.artifacts.sdk.models.response.wrapper

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.task.TaskTradeDataSchema
import kotlinx.serialization.Serializable

/**
 * @param `data`
 */

@Serializable
data class TaskTradeResponseSchema(
    @JsonProperty("data")
    val `data`: TaskTradeDataSchema,
)
