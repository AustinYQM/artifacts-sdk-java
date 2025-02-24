package com.yqmonline.artifacts.sdk.models.achievement

import com.fasterxml.jackson.annotation.JsonProperty

data class AchievementRewards(
    @JsonProperty("gold")
    val gold: Int,
)
