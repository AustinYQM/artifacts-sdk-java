
package com.yqmonline.artifacts.sdk.models.response.wrapper.pagable

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.npc.NPCItem
import kotlinx.serialization.Serializable

/**
 * @param `data`
 * @param total
 * @param page
 * @param propertySize
 * @param pages
 */

@Serializable
data class DataPageNPCItem(
    @JsonProperty("data")
    val `data`: List<NPCItem>,
    @JsonProperty("total")
    val total: Int?,
    @JsonProperty("page")
    val page: Int?,
    @JsonProperty("size")
    val propertySize: Int?,
    @JsonProperty("pages")
    val pages: Int? = null,
)
