
package com.yqmonline.artifacts.sdk.models.response.wrapper

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.items.ge.GETransactionListSchema
import kotlinx.serialization.Serializable

/**
 * @param `data`
 */

@Serializable
data class GETransactionResponseSchema(
    @JsonProperty("data")
    val `data`: GETransactionListSchema,
)
