package com.yqmonline.artifacts.sdk.models.response.wrapper
import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.character.CharacterRestDataSchema

/**
 * @param `data`
 */

data class CharacterRestResponseSchema(
    @JsonProperty("data")
    val `data`: CharacterRestDataSchema,
)
