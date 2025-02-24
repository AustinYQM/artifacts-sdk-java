

package com.yqmonline.artifacts.sdk.models.items.ge

import com.fasterxml.jackson.annotation.JsonProperty
import kotlinx.serialization.Serializable

/**
 * @param id Order id.
 * @param code Item code.
 * @param quantity Item quantity.
 * @param price Item price.
 * @param totalPrice Total price of the transaction.
 */

@Serializable
data class GETransactionSchema(
    // Order id.
    @JsonProperty("id")
    val id: String,
    // Item code.
    @JsonProperty("code")
    val code: String,
    // Item quantity.
    @JsonProperty("quantity")
    val quantity: Int,
    // Item price.
    @JsonProperty("price")
    val price: Int,
    // Total price of the transaction.
    @JsonProperty("total_price")
    val totalPrice: Int,
)
