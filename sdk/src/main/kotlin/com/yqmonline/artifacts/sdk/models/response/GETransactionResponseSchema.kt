
package com.yqmonline.artifacts.sdk.models.response

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.GETransactionListSchema

/**
 * @param `data`
 */

data class GETransactionResponseSchema(
    @JsonProperty("data")
    val `data`: GETransactionListSchema,
)
