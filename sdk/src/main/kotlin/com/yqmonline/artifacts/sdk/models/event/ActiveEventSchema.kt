package com.yqmonline.artifacts.sdk.models.event

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.map.MapSchema
import java.time.OffsetDateTime

/**
 *
 *
 * @param name Name of the event.
 * @param code Code of the event.
 * @param map Map of the event.
 * @param previousSkin Previous map skin.
 * @param duration Duration in minutes.
 * @param expiration Expiration datetime.
 * @param createdAt Start datetime.
 */

data class ActiveEventSchema(
    // Name of the event.
    @JsonProperty("name")
    val name: String,
    // Code of the event.
    @JsonProperty("code")
    val code: String,
    // Map of the event.
    @JsonProperty("map")
    val map: MapSchema,
    // Previous map skin.
    @JsonProperty("previous_skin")
    val previousSkin: String,
    // Duration in minutes.
    @JsonProperty("duration")
    val duration: Int,
    // Expiration datetime.
    @JsonProperty("expiration")
    val expiration: OffsetDateTime,
    // Start datetime.
    @JsonProperty("created_at")
    val createdAt: OffsetDateTime,
)
