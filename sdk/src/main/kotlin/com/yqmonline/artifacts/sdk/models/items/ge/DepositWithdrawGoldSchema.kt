

package com.yqmonline.artifacts.sdk.models.items.ge

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * @param quantity Quantity of gold.
 */

data class DepositWithdrawGoldSchema(
    // Quantity of gold.
    @JsonProperty("quantity")
    val quantity: Int,
)
