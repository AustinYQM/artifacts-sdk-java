
package com.yqmonline.artifacts.sdk.models.response

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.GEOrderTransactionSchema

/**
 * @param `data`
 */

data class GECreateOrderTransactionResponseSchema(
    @JsonProperty("data")
    val `data`: GEOrderTransactionSchema,
)
