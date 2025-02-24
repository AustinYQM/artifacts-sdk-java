

package com.yqmonline.artifacts.sdk.models.npc

import com.fasterxml.jackson.annotation.JsonProperty
import kotlinx.serialization.Serializable

/**
 * @param code The code of the NPC. This is the NPC's unique identifier (ID).
 * @param npc Code of the NPC that sells/buys the item.
 * @param buyPrice
 * @param sellPrice
 */

@Serializable
data class NPCItem(
    // The code of the NPC. This is the NPC's unique identifier (ID).
    @JsonProperty("code")
    val code: String,
    // Code of the NPC that sells/buys the item.
    @JsonProperty("npc")
    val npc: String,
    @JsonProperty("buy_price")
    val buyPrice: Int?,
    @JsonProperty("sell_price")
    val sellPrice: Int?,
)
