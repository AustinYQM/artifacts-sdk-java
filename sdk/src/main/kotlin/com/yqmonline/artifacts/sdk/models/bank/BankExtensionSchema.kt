package com.yqmonline.artifacts.sdk.models.bank

import com.fasterxml.jackson.annotation.JsonProperty
import kotlinx.serialization.Serializable

/**
 * @param price Price of the bank extension.
 */

@Serializable
data class BankExtensionSchema(
    // Price of the bank extension.
    @JsonProperty("price")
    val price: Int,
)
