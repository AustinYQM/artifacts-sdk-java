package com.yqmonline.artifacts.sdk.models.response.wrapper.pagable
import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.account.AccountLeaderboard
import kotlinx.serialization.Serializable

/**
 * @param `data`
 * @param total
 * @param page
 * @param propertySize
 * @param pages
 */

@Serializable
data class DataPageAccountLeaderboardSchema(
    @JsonProperty("data")
    val `data`: List<AccountLeaderboard>,
    @JsonProperty("total")
    val total: Int?,
    @JsonProperty("page")
    val page: Int?,
    @JsonProperty("size")
    val propertySize: Int?,
    @JsonProperty("pages")
    val pages: Int? = null,
)
