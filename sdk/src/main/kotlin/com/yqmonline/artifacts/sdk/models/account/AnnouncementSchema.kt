package com.yqmonline.artifacts.sdk.models.account

import com.fasterxml.jackson.annotation.JsonProperty
import kotlinx.datetime.Instant
import kotlinx.serialization.Serializable

/**
 * @param message Announcement text.
 * @param createdAt Datetime of the announcement.
 */
@Serializable
data class AnnouncementSchema(
    // Announcement text.
    @JsonProperty("message")
    val message: String,
    // Datetime of the announcement.
    @JsonProperty("created_at")
    val createdAt: Instant? = null,
)
