package com.yqmonline.artifacts.sdk.models.bank

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * @param price Price of the bank extension.
 */

data class BankExtensionSchema(
    // Price of the bank extension.
    @JsonProperty("price")
    val price: Int,
)
