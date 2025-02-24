package com.yqmonline.artifacts.sdk.models.response
import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.CharacterRestDataSchema

/**
 * @param `data`
 */

data class CharacterRestResponseSchema(
    @JsonProperty("data")
    val `data`: CharacterRestDataSchema,
)
