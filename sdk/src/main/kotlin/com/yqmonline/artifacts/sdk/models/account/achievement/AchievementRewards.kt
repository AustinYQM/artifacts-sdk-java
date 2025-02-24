package com.yqmonline.artifacts.sdk.models.account.achievement

import com.fasterxml.jackson.annotation.JsonProperty
import kotlinx.serialization.Serializable

@Serializable
data class AchievementRewards(
    @JsonProperty("gold")
    val gold: Int,
)
