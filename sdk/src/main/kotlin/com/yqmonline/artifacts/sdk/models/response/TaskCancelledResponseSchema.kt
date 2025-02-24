
package com.yqmonline.artifacts.sdk.models.response

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.TaskCancelledSchema

/**
 * @param `data`
 */

data class TaskCancelledResponseSchema(
    @JsonProperty("data")
    val `data`: TaskCancelledSchema,
)
