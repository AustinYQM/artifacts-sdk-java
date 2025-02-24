
package com.yqmonline.artifacts.sdk.models.response.wrapper

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.npc.NPCSchema
import kotlinx.serialization.Serializable

/**
 * @param `data`
 */

@Serializable
data class NPCResponseSchema(
    @JsonProperty("data")
    val `data`: NPCSchema,
)
