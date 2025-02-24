package com.yqmonline.artifacts.sdk.models

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * @param `data`
 */

data class BadgeResponseSchema(
    @JsonProperty("data")
    val `data`: BadgeSchema,
)
