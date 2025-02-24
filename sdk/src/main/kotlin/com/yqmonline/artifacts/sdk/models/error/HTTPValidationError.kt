
package com.yqmonline.artifacts.sdk.models.error

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * @param detail
 */

data class HTTPValidationError(
    @JsonProperty("detail")
    val detail: List<ValidationError>? = null,
)
