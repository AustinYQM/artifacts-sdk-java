package com.yqmonline.artifacts.sdk.models.account.achievement

import com.fasterxml.jackson.annotation.JsonProperty

data class AchievementRewards(
    @JsonProperty("gold")
    val gold: Int,
)
