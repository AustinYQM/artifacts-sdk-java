

package com.yqmonline.artifacts.sdk.models.response

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * @param message
 */

data class ResponseSchema(
    @JsonProperty("message")
    val message: String,
)
