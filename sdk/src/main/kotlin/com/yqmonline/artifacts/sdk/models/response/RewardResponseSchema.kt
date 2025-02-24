
package com.yqmonline.artifacts.sdk.models.response

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.DropRateSchema

/**
 * @param `data`
 */

data class RewardResponseSchema(
    @JsonProperty("data")
    val `data`: DropRateSchema,
)
