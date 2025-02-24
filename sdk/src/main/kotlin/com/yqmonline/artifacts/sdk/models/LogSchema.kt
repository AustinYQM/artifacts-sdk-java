
package com.yqmonline.artifacts.sdk.models

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.enums.types.LogType
import kotlinx.datetime.Instant
import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable

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

@Serializable
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
    @Contextual
    val content: Any?,
    // Cooldown in seconds.
    @JsonProperty("cooldown")
    val cooldown: Int,
    @JsonProperty("cooldown_expiration")
    val cooldownExpiration: Instant?,
    // Datetime of creation.
    @JsonProperty("created_at")
    val createdAt: Instant,
)
