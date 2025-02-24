
package com.yqmonline.artifacts.sdk.models.response.wrapper

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.items.equip.EquipRequestSchema
import kotlinx.serialization.Serializable

/**
 * @param `data`
 */

@Serializable
data class EquipmentResponseSchema(
    @JsonProperty("data")
    val `data`: EquipRequestSchema,
)
