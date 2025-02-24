
package com.yqmonline.artifacts.sdk.models.response.wrapper

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.items.DropRateSchema

/**
 * @param `data`
 */

data class RewardResponseSchema(
    @JsonProperty("data")
    val `data`: DropRateSchema,
)
