package com.yqmonline.artifacts.sdk.models.account

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.enums.types.AchievementType
import com.yqmonline.artifacts.sdk.models.achievement.AchievementRewards
import java.time.OffsetDateTime

/**
 * @param name Name of the achievement.
 * @param code Code of the achievement.
 * @param description Description of the achievement.
 * @param points Points of the achievement. Used for the leaderboard.
 * @param type Type of achievement.
 * @param target
 * @param total Total to do.
 * @param rewards Rewards.
 * @param current Current progress.
 * @param completedAt
 */

data class AccountAchievement(
    // Name of the achievement.
    @JsonProperty("name")
    val name: String,
    // Code of the achievement.
    @JsonProperty("code")
    val code: String,
    // Description of the achievement.
    @JsonProperty("description")
    val description: String,
    // Points of the achievement. Used for the leaderboard.
    @JsonProperty("points")
    val points: Int,
    // Type of achievement.
    @JsonProperty("type")
    val type: AchievementType,
    @JsonProperty("target")
    val target: String?,
    // Total to do.
    @JsonProperty("total")
    val total: Int,
    // Rewards.
    @JsonProperty("rewards")
    val rewards: AchievementRewards,
    // Current progress.
    @JsonProperty("current")
    val current: Int,
    @JsonProperty("completed_at")
    val completedAt: OffsetDateTime?,
)
