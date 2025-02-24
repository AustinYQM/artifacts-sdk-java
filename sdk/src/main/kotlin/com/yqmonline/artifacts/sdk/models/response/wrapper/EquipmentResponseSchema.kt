
package com.yqmonline.artifacts.sdk.models.response.wrapper

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.items.equip.EquipRequestSchema

/**
 * @param `data`
 */

data class EquipmentResponseSchema(
    @JsonProperty("data")
    val `data`: EquipRequestSchema,
)
