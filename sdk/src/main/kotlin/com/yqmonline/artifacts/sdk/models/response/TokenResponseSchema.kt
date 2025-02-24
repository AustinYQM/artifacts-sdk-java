

package com.yqmonline.artifacts.sdk.models.response

import com.fasterxml.jackson.annotation.JsonProperty
import kotlinx.serialization.Serializable

/**
 * @param token
 */

@Serializable
data class TokenResponseSchema(
    @JsonProperty("token")
    val token: String,
)
