

package com.yqmonline.artifacts.sdk.models.map

import com.fasterxml.jackson.annotation.JsonProperty
import kotlinx.serialization.Serializable

/**
 * @param type Type of the content.
 * @param code Code of the content.
 */

@Serializable
data class MapContentSchema(
    // Type of the content.
    @JsonProperty("type")
    val type: String,
    // Code of the content.
    @JsonProperty("code")
    val code: String,
)
