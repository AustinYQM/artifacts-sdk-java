package com.yqmonline.artifacts.sdk.models.response.wrapper
import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.character.CharacterFightDataSchema

/**
 * @param `data`
 */

data class CharacterFightResponseSchema(
    @JsonProperty("data")
    val `data`: CharacterFightDataSchema,
)
