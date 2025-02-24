
package com.yqmonline.artifacts.sdk.models.response

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.NpcMerchantTransactionSchema

/**
 * @param `data`
 */

data class NpcMerchantTransactionResponseSchema(
    @JsonProperty("data")
    val `data`: NpcMerchantTransactionSchema,
)
