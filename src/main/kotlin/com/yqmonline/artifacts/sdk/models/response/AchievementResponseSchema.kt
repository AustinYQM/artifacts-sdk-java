package com.yqmonline.artifacts.sdk.models.response

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.achievement.AchievementSchema

data class AchievementResponseSchema(
    @JsonProperty("data")
    val `data`: AchievementSchema,
)
