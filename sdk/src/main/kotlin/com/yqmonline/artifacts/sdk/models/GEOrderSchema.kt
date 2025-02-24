

package com.yqmonline.artifacts.sdk.models

import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime

/**
 * @param id Order id.
 * @param seller Seller account name.
 * @param code Item code.
 * @param quantity Item quantity.
 * @param price Item price per unit.
 * @param createdAt Order created at.
 */

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
    val createdAt: OffsetDateTime,
)
