package com.yqmonline.artifacts.sdk.models.response.wrapper
import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.character.CharacterSchema
import kotlinx.serialization.Serializable

/**
 * @param `data`
 */

@Serializable
data class CharacterResponseSchema(
    @JsonProperty("data")
    val `data`: CharacterSchema,
)
