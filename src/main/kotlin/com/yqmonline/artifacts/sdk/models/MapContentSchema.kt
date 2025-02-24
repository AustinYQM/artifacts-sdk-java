

package com.yqmonline.artifacts.sdk.models

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * @param type Type of the content.
 * @param code Code of the content.
 */

data class MapContentSchema(
    // Type of the content.
    @JsonProperty("type")
    val type: String,
    // Code of the content.
    @JsonProperty("code")
    val code: String,
)
