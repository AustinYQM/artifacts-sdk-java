
package com.yqmonline.artifacts.sdk.models.response

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.NPCSchema

/**
 * @param `data`
 */

data class NPCResponseSchema(
    @JsonProperty("data")
    val `data`: NPCSchema,
)
