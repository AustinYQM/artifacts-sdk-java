package com.yqmonline.artifacts.sdk.models.response

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.bank.BankExtensionTransactionSchema

/**
 * @param `data`
 */

data class BankExtensionTransactionResponseSchema(
    @JsonProperty("data")
    val `data`: BankExtensionTransactionSchema,
)
