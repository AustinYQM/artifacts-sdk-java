package com.yqmonline.artifacts.sdk.models.account

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * @param `data`
 */

data class AccountDetailsSchema(
    @JsonProperty("data")
    val `data`: AccountDetails,
)
