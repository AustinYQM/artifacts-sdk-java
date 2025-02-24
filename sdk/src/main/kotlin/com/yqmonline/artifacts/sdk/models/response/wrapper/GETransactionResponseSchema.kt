
package com.yqmonline.artifacts.sdk.models.response.wrapper

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.items.ge.GETransactionListSchema

/**
 * @param `data`
 */

data class GETransactionResponseSchema(
    @JsonProperty("data")
    val `data`: GETransactionListSchema,
)
