
package com.yqmonline.artifacts.sdk.models.response.wrapper

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.npc.NPCMerchantTransactionSchema
import kotlinx.serialization.Serializable

/**
 * @param `data`
 */

@Serializable
data class NpcMerchantTransactionResponseSchema(
    @JsonProperty("data")
    val `data`: NPCMerchantTransactionSchema,
)
