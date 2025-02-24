package com.yqmonline.artifacts.sdk.models.response
import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.CharacterFightDataSchema

/**
 * @param `data`
 */

data class CharacterFightResponseSchema(
    @JsonProperty("data")
    val `data`: CharacterFightDataSchema,
)
