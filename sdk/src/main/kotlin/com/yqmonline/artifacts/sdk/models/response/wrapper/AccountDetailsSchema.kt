package com.yqmonline.artifacts.sdk.models.response.wrapper

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.account.management.AccountDetails
import kotlinx.serialization.Serializable

/**
 * @param `data`
 */

@Serializable
data class AccountDetailsSchema(
    @JsonProperty("data")
    val `data`: AccountDetails,
)
