
package com.yqmonline.artifacts.sdk.models.response.wrapper

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.items.ge.GEOrderTransactionSchema
import kotlinx.serialization.Serializable

/**
 * @param `data`
 */

@Serializable
data class GECreateOrderTransactionResponseSchema(
    @JsonProperty("data")
    val `data`: GEOrderTransactionSchema,
)
