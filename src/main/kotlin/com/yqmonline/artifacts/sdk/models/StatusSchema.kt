
package com.yqmonline.artifacts.sdk.models

import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime

/**
 * @param status Server status
 * @param version Game version.
 * @param maxLevel Maximum level.
 * @param charactersOnline Characters online.
 * @param serverTime Server time.
 * @param announcements Server announcements.
 * @param lastWipe Last server wipe.
 * @param nextWipe Next server wipe.
 */

data class StatusSchema(
    // Server status
    @JsonProperty("status")
    val status: String,
    // Game version.
    @JsonProperty("version")
    val version: String,
    // Maximum level.
    @JsonProperty("max_level")
    val maxLevel: Int,
    // Characters online.
    @JsonProperty("characters_online")
    val charactersOnline: Int,
    // Server time.
    @JsonProperty("server_time")
    val serverTime: OffsetDateTime,
    // Server announcements.
    @JsonProperty("announcements")
    val announcements: List<AnnouncementSchema>,
    // Last server wipe.
    @JsonProperty("last_wipe")
    val lastWipe: String,
    // Next server wipe.
    @JsonProperty("next_wipe")
    val nextWipe: String,
)
