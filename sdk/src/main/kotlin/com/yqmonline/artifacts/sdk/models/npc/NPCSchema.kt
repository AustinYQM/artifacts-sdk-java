
package com.yqmonline.artifacts.sdk.models.npc

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.enums.types.NPCType

/**
 * @param name Name of the NPC.
 * @param code The code of the NPC. This is the NPC's unique identifier (ID).
 * @param description Description of the NPC.
 * @param type Type of the NPC.
 */

data class NPCSchema(
    // Name of the NPC.
    @JsonProperty("name")
    val name: String,
    // The code of the NPC. This is the NPC's unique identifier (ID).
    @JsonProperty("code")
    val code: String,
    // Description of the NPC.
    @JsonProperty("description")
    val description: String,
    // Type of the NPC.
    @JsonProperty("type")
    val type: NPCType,
)
