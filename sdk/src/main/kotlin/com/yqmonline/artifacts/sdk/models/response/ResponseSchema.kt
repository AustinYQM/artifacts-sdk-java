

package com.yqmonline.artifacts.sdk.models.response

import com.fasterxml.jackson.annotation.JsonProperty
import kotlinx.serialization.Serializable

/**
 * @param message
 */

@Serializable
data class ResponseSchema(
    @JsonProperty("message")
    val message: String,
)
