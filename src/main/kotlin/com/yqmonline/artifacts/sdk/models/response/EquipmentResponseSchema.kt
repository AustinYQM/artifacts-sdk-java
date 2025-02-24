
package com.yqmonline.artifacts.sdk.models.response

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.EquipRequestSchema

/**
 * @param `data`
 */

data class EquipmentResponseSchema(
    @JsonProperty("data")
    val `data`: EquipRequestSchema,
)
