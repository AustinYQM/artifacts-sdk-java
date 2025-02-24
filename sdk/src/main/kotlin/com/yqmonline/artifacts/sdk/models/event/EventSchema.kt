
package com.yqmonline.artifacts.sdk.models.event

import com.fasterxml.jackson.annotation.JsonProperty
import kotlinx.serialization.Serializable

/**
 * @param name Name of the event.
 * @param code Code of the event.
 * @param maps Map list of the event.
 * @param skin Map skin of the event.
 * @param duration Duration in minutes.
 * @param rate Rate spawn of the event. (1/rate every minute)
 * @param content Content of the event.
 */

@Serializable
data class EventSchema(
    // Name of the event.
    @JsonProperty("name")
    val name: String,
    // Code of the event.
    @JsonProperty("code")
    val code: String,
    // Map list of the event.
    @JsonProperty("maps")
    val maps: List<EventMapSchema>,
    // Map skin of the event.
    @JsonProperty("skin")
    val skin: String,
    // Duration in minutes.
    @JsonProperty("duration")
    val duration: Int,
    // Rate spawn of the event. (1/rate every minute)
    @JsonProperty("rate")
    val rate: Int,
    // Content of the event.
    @JsonProperty("content")
    val content: EventContentSchema,
)
