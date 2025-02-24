
package com.yqmonline.artifacts.sdk.models.error

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * @param loc
 * @param msg
 * @param type
 */

data class ValidationError(
    @JsonProperty("loc")
    val loc: List<ValidationErrorLocInner>,
    @JsonProperty("msg")
    val msg: String,
    @JsonProperty("type")
    val type: String,
)
