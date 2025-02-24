package com.yqmonline.artifacts.sdk.models.response.wrapper

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.bank.BankSchema

/**
 * @param `data`
 */

data class BankResponseSchema(
    @JsonProperty("data")
    val `data`: BankSchema,
)
