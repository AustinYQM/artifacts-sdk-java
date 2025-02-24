package com.yqmonline.artifacts.sdk.models

import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime

/**
 * @param message Announcement text.
 * @param createdAt Datetime of the announcement.
 */
data class AnnouncementSchema(
    // Announcement text.
    @JsonProperty("message")
    val message: String,
    // Datetime of the announcement.
    @JsonProperty("created_at")
    val createdAt: OffsetDateTime? = null,
)
