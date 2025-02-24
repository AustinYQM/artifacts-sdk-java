

package com.yqmonline.artifacts.sdk.models.response

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * @param token
 */

data class TokenResponseSchema(
    @JsonProperty("token")
    val token: String,
)
