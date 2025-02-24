
package com.yqmonline.artifacts.sdk.models.response

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.MonsterSchema

/**
 * @param `data`
 * @param total
 * @param page
 * @param propertySize
 * @param pages
 */

data class DataPageMonsterSchema(
    @JsonProperty("data")
    val `data`: List<MonsterSchema>,
    @JsonProperty("total")
    val total: Int?,
    @JsonProperty("page")
    val page: Int?,
    @JsonProperty("size")
    val propertySize: Int?,
    @JsonProperty("pages")
    val pages: Int? = null,
)
