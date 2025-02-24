
package com.yqmonline.artifacts.sdk.models.response.wrapper

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.task.TaskCancelledSchema

/**
 * @param `data`
 */

data class TaskCancelledResponseSchema(
    @JsonProperty("data")
    val `data`: TaskCancelledSchema,
)
