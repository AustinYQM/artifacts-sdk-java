
package com.yqmonline.artifacts.sdk.models.account.management

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.account.badge.BadgeSchema
import com.yqmonline.artifacts.sdk.models.enums.AccountStatus
import kotlinx.serialization.Serializable

/**
 * @param username Username.
 * @param email Email.
 * @param subscribed Subscribed for the current season.
 * @param status Member status.
 * @param gems Gems.
 * @param achievementsPoints Achievement points.
 * @param banned Banned.
 * @param badges Account badges.
 * @param banReason Ban reason.
 */

@Serializable
data class MyAccountDetails(
    // Username.
    @JsonProperty("username")
    val username: String,
    // Email.
    @JsonProperty("email")
    val email: String,
    // Subscribed for the current season.
    @JsonProperty("subscribed")
    val subscribed: Boolean,
    // Member status.
    @JsonProperty("status")
    val status: AccountStatus,
    // Gems.
    @JsonProperty("gems")
    val gems: Int,
    // Achievement points.
    @JsonProperty("achievements_points")
    val achievementsPoints: Int,
    // Banned.
    @JsonProperty("banned")
    val banned: Boolean,
    // Account badges.
    @JsonProperty("badges")
    val badges: List<BadgeSchema>? = null,
    // Ban reason.
    @JsonProperty("ban_reason")
    val banReason: String? = null,
)
