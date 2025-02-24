
package com.yqmonline.artifacts.sdk.models.response.wrapper

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.task.TaskFullSchema
import kotlinx.serialization.Serializable

/**
 * @param `data`
 */

@Serializable
data class TaskFullResponseSchema(
    @JsonProperty("data")
    val `data`: TaskFullSchema,
)
