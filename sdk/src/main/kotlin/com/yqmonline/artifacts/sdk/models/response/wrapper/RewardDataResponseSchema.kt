
package com.yqmonline.artifacts.sdk.models.response.wrapper

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.task.RewardDataSchema

/**
 * @param `data`
 */

data class RewardDataResponseSchema(
    @JsonProperty("data")
    val `data`: RewardDataSchema,
)
