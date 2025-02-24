package com.yqmonline.artifacts.sdk.models.response.wrapper

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.bank.BankItemTransactionSchema
import kotlinx.serialization.Serializable

/**
 * @param `data`
 */

@Serializable
data class BankItemTransactionResponseSchema(
    @JsonProperty("data")
    val `data`: BankItemTransactionSchema,
)
