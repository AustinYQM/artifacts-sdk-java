package com.yqmonline.artifacts.sdk.models.response.wrapper

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.account.achievement.AchievementSchema
import kotlinx.serialization.Serializable

@Serializable
data class AchievementResponseSchema(
    @JsonProperty("data")
    val `data`: AchievementSchema,
)
