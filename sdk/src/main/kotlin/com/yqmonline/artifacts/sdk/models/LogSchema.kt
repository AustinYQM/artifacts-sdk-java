
package com.yqmonline.artifacts.sdk.models

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.enums.types.LogType
import java.time.OffsetDateTime

/**
 * @param character Character name.
 * @param account Account character.
 * @param type Type of action.
 * @param description Description of action.
 * @param content
 * @param cooldown Cooldown in seconds.
 * @param cooldownExpiration
 * @param createdAt Datetime of creation.
 */

data class LogSchema(
    // Character name.
    @JsonProperty("character")
    val character: String,
    // Account character.
    @JsonProperty("account")
    val account: String,
    // Type of action.
    @JsonProperty("type")
    val type: LogType,
    // Description of action.
    @JsonProperty("description")
    val description: String,
    @JsonProperty("content")
    val content: Any?,
    // Cooldown in seconds.
    @JsonProperty("cooldown")
    val cooldown: Int,
    @JsonProperty("cooldown_expiration")
    val cooldownExpiration: OffsetDateTime?,
    // Datetime of creation.
    @JsonProperty("created_at")
    val createdAt: OffsetDateTime,
)
