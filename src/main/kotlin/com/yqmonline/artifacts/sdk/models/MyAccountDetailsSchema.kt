
package com.yqmonline.artifacts.sdk.models

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * @param `data`
 */

data class MyAccountDetailsSchema(
    @JsonProperty("data")
    val `data`: MyAccountDetails,
)
