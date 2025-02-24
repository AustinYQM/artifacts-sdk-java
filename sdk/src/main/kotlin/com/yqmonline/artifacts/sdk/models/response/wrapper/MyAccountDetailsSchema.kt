
package com.yqmonline.artifacts.sdk.models.response.wrapper

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.account.management.MyAccountDetails
import kotlinx.serialization.Serializable

/**
 * @param `data`
 */

@Serializable
data class MyAccountDetailsSchema(
    @JsonProperty("data")
    val `data`: MyAccountDetails,
)
