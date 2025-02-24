package com.yqmonline.artifacts.sdk.models.response
import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.account.AccountLeaderboard

/**
 * @param `data`
 * @param total
 * @param page
 * @param propertySize
 * @param pages
 */

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
