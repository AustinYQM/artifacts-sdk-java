
package com.yqmonline.artifacts.sdk.models.response.wrapper

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.npc.NPCSchema

/**
 * @param `data`
 */

data class NPCResponseSchema(
    @JsonProperty("data")
    val `data`: NPCSchema,
)
