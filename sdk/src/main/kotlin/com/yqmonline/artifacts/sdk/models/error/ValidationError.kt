
package com.yqmonline.artifacts.sdk.models.error

import com.fasterxml.jackson.annotation.JsonProperty
import kotlinx.serialization.Serializable

/**
 * @param loc
 * @param msg
 * @param type
 */

@Serializable
data class ValidationError(
    @JsonProperty("loc")
    val loc: List<ValidationErrorLocInner>,
    @JsonProperty("msg")
    val msg: String,
    @JsonProperty("type")
    val type: String,
)
