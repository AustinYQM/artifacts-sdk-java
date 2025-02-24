
package com.yqmonline.artifacts.sdk.models.response

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.TaskFullSchema

/**
 * @param `data`
 */

data class TaskFullResponseSchema(
    @JsonProperty("data")
    val `data`: TaskFullSchema,
)
