

package com.yqmonline.artifacts.sdk.models

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * @param type Type of the event.
 * @param code Code content.
 */

data class EventContentSchema(
    // Type of the event.
    @JsonProperty("type")
    val type: String,
    // Code content.
    @JsonProperty("code")
    val code: String,
)
