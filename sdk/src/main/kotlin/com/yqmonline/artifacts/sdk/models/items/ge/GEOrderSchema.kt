

package com.yqmonline.artifacts.sdk.models.items.ge

import com.fasterxml.jackson.annotation.JsonProperty
import kotlinx.datetime.Instant
import kotlinx.serialization.Serializable

/**
 * @param id Order id.
 * @param seller Seller account name.
 * @param code Item code.
 * @param quantity Item quantity.
 * @param price Item price per unit.
 * @param createdAt Order created at.
 */

@Serializable
data class GEOrderSchema(
    // Order id.
    @JsonProperty("id")
    val id: String,
    // Seller account name.
    @JsonProperty("seller")
    val seller: String,
    // Item code.
    @JsonProperty("code")
    val code: String,
    // Item quantity.
    @JsonProperty("quantity")
    val quantity: Int,
    // Item price per unit.
    @JsonProperty("price")
    val price: Int,
    // Order created at.
    @JsonProperty("created_at")
    val createdAt: Instant,
)
