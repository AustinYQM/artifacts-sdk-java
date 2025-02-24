
package com.yqmonline.artifacts.sdk.models.response

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.StatusSchema

/**
 * @param `data`
 */

data class StatusResponseSchema(
    @JsonProperty("data")
    val `data`: StatusSchema,
)
