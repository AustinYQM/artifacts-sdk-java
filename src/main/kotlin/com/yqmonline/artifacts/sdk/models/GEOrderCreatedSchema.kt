

package com.yqmonline.artifacts.sdk.models

import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime

/**
 * @param id Order id.
 * @param createdAt Order created at.
 * @param code Item code.
 * @param quantity Item quantity.
 * @param price Item price per unit.
 * @param totalPrice Total price.
 * @param tax Order creation tax (3%, minimum 1)
 */

data class GEOrderCreatedSchema(
    // Order id.
    @JsonProperty("id")
    val id: String,
    // Order created at.
    @JsonProperty("created_at")
    val createdAt: OffsetDateTime,
    // Item code.
    @JsonProperty("code")
    val code: String,
    // Item quantity.
    @JsonProperty("quantity")
    val quantity: Int,
    // Item price per unit.
    @JsonProperty("price")
    val price: Int,
    // Total price.
    @JsonProperty("total_price")
    val totalPrice: Int,
    // Order creation tax (3%, minimum 1)
    @JsonProperty("tax")
    val tax: Int,
)
