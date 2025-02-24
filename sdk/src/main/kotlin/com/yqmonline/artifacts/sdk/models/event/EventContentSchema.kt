

package com.yqmonline.artifacts.sdk.models.event

import com.fasterxml.jackson.annotation.JsonProperty
import kotlinx.serialization.Serializable

/**
 * @param type Type of the event.
 * @param code Code content.
 */

@Serializable
data class EventContentSchema(
    // Type of the event.
    @JsonProperty("type")
    val type: String,
    // Code content.
    @JsonProperty("code")
    val code: String,
)
