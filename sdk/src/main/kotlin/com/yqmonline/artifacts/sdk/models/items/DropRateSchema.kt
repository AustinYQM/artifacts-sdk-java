

package com.yqmonline.artifacts.sdk.models.items

import com.fasterxml.jackson.annotation.JsonProperty
import kotlinx.serialization.Serializable

/**
 * @param code Item code.
 * @param rate Chance rate. (1/rate)
 * @param minQuantity Minimum quantity.
 * @param maxQuantity Maximum quantity.
 */

@Serializable
data class DropRateSchema(
    // Item code.
    @JsonProperty("code")
    val code: String,
    // Chance rate. (1/rate)
    @JsonProperty("rate")
    val rate: Int,
    // Minimum quantity.
    @JsonProperty("min_quantity")
    val minQuantity: Int,
    // Maximum quantity.
    @JsonProperty("max_quantity")
    val maxQuantity: Int,
)
