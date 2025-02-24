
package com.yqmonline.artifacts.sdk.models.response

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.TaskDataSchema

/**
 * @param `data`
 */

data class TaskResponseSchema(
    @JsonProperty("data")
    val `data`: TaskDataSchema,
)
