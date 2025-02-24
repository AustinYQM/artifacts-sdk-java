package com.yqmonline.artifacts.sdk.models.account.management

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.enums.AccountStatus

/**
 *
 *
 * @param username Username.
 * @param subscribed Subscribed for the current season.
 * @param status Member status.
 * @param achievementsPoints Achievement points.
 * @param banned Banned.
 * @param badges Account badges.
 * @param banReason Ban reason.
 */

data class AccountDetails(
    // Username.
    @JsonProperty("username")
    val username: String,
    // Subscribed for the current season.
    @JsonProperty("subscribed")
    val subscribed: Boolean,
    // Member status.
    @JsonProperty("status")
    val status: AccountStatus,
    // Achievement points.
    @JsonProperty("achievements_points")
    val achievementsPoints: Int,
    // Banned.
    @JsonProperty("banned")
    val banned: Boolean,
    // Account badges.
    @JsonProperty("badges")
    val badges: List<Any>? = null,
    // Ban reason.
    @JsonProperty("ban_reason")
    val banReason: String? = null,
)
