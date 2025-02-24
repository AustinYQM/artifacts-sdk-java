
package com.yqmonline.artifacts.sdk.models.error

import com.fasterxml.jackson.annotation.JsonProperty
import kotlinx.serialization.Serializable

/**
 * @param detail
 */

@Serializable
data class HTTPValidationError(
    @JsonProperty("detail")
    val detail: List<ValidationError>? = null,
)
