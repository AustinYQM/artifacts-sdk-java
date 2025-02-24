
package com.yqmonline.artifacts.sdk.models.response.wrapper

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.account.StatusSchema

/**
 * @param `data`
 */

data class StatusResponseSchema(
    @JsonProperty("data")
    val `data`: StatusSchema,
)
