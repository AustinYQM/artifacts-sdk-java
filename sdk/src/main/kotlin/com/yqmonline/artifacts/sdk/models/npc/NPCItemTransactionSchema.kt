package com.yqmonline.artifacts.sdk.models.npc

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * @param code Item code.
 * @param quantity Item quantity.
 * @param price Item price.
 * @param totalPrice Total price of the transaction.
 */

data class NpcItemTransactionSchema(
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
