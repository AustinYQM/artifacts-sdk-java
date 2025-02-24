package com.yqmonline.artifacts.sdk.models.response.wrapper

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.bank.BankItemTransactionSchema

/**
 * @param `data`
 */

data class BankItemTransactionResponseSchema(
    @JsonProperty("data")
    val `data`: BankItemTransactionSchema,
)
