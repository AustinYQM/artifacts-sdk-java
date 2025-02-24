
package com.yqmonline.artifacts.sdk.models.response.wrapper

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.task.TaskFullSchema

/**
 * @param `data`
 */

data class TaskFullResponseSchema(
    @JsonProperty("data")
    val `data`: TaskFullSchema,
)
