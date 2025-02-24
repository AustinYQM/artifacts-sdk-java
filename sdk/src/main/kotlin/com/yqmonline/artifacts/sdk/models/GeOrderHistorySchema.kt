

package com.yqmonline.artifacts.sdk.models

import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime

/**
 * @param orderId Order id.
 * @param seller Seller account name.
 * @param buyer Buyer account name.
 * @param code Item code.
 * @param quantity Item quantity.
 * @param price Item price per unit.
 * @param soldAt Sale datetime.
 */

data class GeOrderHistorySchema(
    // Order id.
    @JsonProperty("order_id")
    val orderId: String,
    // Seller account name.
    @JsonProperty("seller")
    val seller: String,
    // Buyer account name.
    @JsonProperty("buyer")
    val buyer: String,
    // Item code.
    @JsonProperty("code")
    val code: String,
    // Item quantity.
    @JsonProperty("quantity")
    val quantity: Int,
    // Item price per unit.
    @JsonProperty("price")
    val price: Int,
    // Sale datetime.
    @JsonProperty("sold_at")
    val soldAt: OffsetDateTime,
)
