

package com.yqmonline.artifacts.sdk.models

import com.fasterxml.jackson.annotation.JsonProperty
import kotlinx.serialization.Serializable

/**
 * @param code Effect code.
 * @param `value` Effect value.
 */

@Serializable
data class SimpleEffectSchema(
    // Effect code.
    @JsonProperty("code")
    val code: String,
    // Effect value.
    @JsonProperty("value")
    val `value`: Int,
)
