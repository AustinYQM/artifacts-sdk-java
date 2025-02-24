package com.yqmonline.artifacts.sdk.models.response.wrapper

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.bank.BankGoldTransactionSchema
import kotlinx.serialization.Serializable

/**
 * @param `data`
 */

@Serializable
data class BankGoldTransactionResponseSchema(
    @JsonProperty("data")
    val `data`: BankGoldTransactionSchema,
)
