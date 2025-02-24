package com.yqmonline.artifacts.sdk.models.account

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.enums.AccountStatus

/**
 * @param position Position in the leaderboard.
 * @param account Account name.
 * @param status Member status.
 * @param achievementsPoints Achievements points.
 * @param gold Gold in the account.
 */

data class AccountLeaderboard(
    // Position in the leaderboard.
    @JsonProperty("position")
    val position: Int,
    // Account name.
    @JsonProperty("account")
    val account: String,
    // Member status.
    @JsonProperty("status")
    val status: AccountStatus,
    // Achievements points.
    @JsonProperty("achievements_points")
    val achievementsPoints: Int,
    // Gold in the account.
    @JsonProperty("gold")
    val gold: Int,
)
