

package com.yqmonline.artifacts.sdk.models.items

import com.fasterxml.jackson.annotation.JsonProperty
import kotlinx.serialization.Serializable

/**
 * @param quantity Quantity of gold.
 */

@Serializable
data class GoldSchema(
    // Quantity of gold.
    @JsonProperty("quantity")
    val quantity: Int,
)
