package com.yqmonline.artifacts.sdk.models.response.wrapper

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.account.badge.BadgeSchema

/**
 * @param `data`
 */

data class BadgeResponseSchema(
    @JsonProperty("data")
    val `data`: BadgeSchema,
)
