
package com.yqmonline.artifacts.sdk.models.response

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.RewardDataSchema

/**
 * @param `data`
 */

data class RewardDataResponseSchema(
    @JsonProperty("data")
    val `data`: RewardDataSchema,
)
