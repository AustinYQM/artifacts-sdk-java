
package com.yqmonline.artifacts.sdk.models.response.wrapper

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.npc.NPCMerchantTransactionSchema

/**
 * @param `data`
 */

data class NpcMerchantTransactionResponseSchema(
    @JsonProperty("data")
    val `data`: NPCMerchantTransactionSchema,
)
