package com.yqmonline.artifacts.sdk.models.response
import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.CharacterSchema

/**
 * @param `data`
 */

data class CharacterResponseSchema(
    @JsonProperty("data")
    val `data`: CharacterSchema,
)
