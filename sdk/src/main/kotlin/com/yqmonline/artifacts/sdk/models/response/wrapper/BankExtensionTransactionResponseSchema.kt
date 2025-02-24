package com.yqmonline.artifacts.sdk.models.response.wrapper

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.bank.BankExtensionTransactionSchema
import kotlinx.serialization.Serializable

/**
 * @param `data`
 */

@Serializable
data class BankExtensionTransactionResponseSchema(
    @JsonProperty("data")
    val `data`: BankExtensionTransactionSchema,
)
