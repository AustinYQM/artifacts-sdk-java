package com.yqmonline.artifacts.sdk.models.response.wrapper.pagable
import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.account.achievement.AchievementSchema
import kotlinx.serialization.Serializable

/**
 * @param `data`
 * @param total
 * @param page
 * @param propertySize
 * @param pages
 */

@Serializable
data class DataPageAchievementSchema(
    @JsonProperty("data")
    val `data`: List<AchievementSchema>,
    @JsonProperty("total")
    val total: Int?,
    @JsonProperty("page")
    val page: Int?,
    @JsonProperty("size")
    val propertySize: Int?,
    @JsonProperty("pages")
    val pages: Int? = null,
)
