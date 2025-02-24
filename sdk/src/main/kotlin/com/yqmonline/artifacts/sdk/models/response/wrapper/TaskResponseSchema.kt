
package com.yqmonline.artifacts.sdk.models.response.wrapper

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.task.TaskDataSchema

/**
 * @param `data`
 */

data class TaskResponseSchema(
    @JsonProperty("data")
    val `data`: TaskDataSchema,
)
