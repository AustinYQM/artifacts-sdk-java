package com.yqmonline.artifacts.sdk.models
import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.enums.types.ActionType

/**
 * @param totalSeconds The total seconds of the cooldown.
 * @param remainingSeconds The remaining seconds of the cooldown.
 * @param startedAt The start of the cooldown.
 * @param expiration The expiration of the cooldown.
 * @param reason The reason of the cooldown.
 */

data class CooldownSchema(
    // The total seconds of the cooldown.
    @JsonProperty("total_seconds")
    val totalSeconds: Int,
    // The remaining seconds of the cooldown.
    @JsonProperty("remaining_seconds")
    val remainingSeconds: Int,
    // The start of the cooldown.
    @JsonProperty("started_at")
    val startedAt: java.time.OffsetDateTime,
    // The expiration of the cooldown.
    @JsonProperty("expiration")
    val expiration: java.time.OffsetDateTime,
    // The reason of the cooldown.
    @JsonProperty("reason")
    val reason: ActionType,
)
