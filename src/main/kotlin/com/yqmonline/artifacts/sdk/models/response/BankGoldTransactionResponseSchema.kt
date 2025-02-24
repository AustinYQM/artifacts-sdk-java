package com.yqmonline.artifacts.sdk.models.response

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.bank.BankGoldTransactionSchema

/**
 * @param `data`
 */

data class BankGoldTransactionResponseSchema(
    @JsonProperty("data")
    val `data`: BankGoldTransactionSchema,
)
