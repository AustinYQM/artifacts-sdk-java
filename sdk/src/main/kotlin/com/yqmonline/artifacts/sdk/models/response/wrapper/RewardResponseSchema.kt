
package com.yqmonline.artifacts.sdk.models.response.wrapper

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.items.DropRateSchema
import kotlinx.serialization.Serializable

/**
 * @param `data`
 */

@Serializable
data class RewardResponseSchema(
    @JsonProperty("data")
    val `data`: DropRateSchema,
)
