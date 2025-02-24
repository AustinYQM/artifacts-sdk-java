
package com.yqmonline.artifacts.sdk.models.response.wrapper

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.account.StatusSchema
import kotlinx.serialization.Serializable

/**
 * @param `data`
 */

@Serializable
data class StatusResponseSchema(
    @JsonProperty("data")
    val `data`: StatusSchema,
)
