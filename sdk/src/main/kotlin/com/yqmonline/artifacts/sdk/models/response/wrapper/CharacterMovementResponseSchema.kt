package com.yqmonline.artifacts.sdk.models.response.wrapper
import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.character.CharacterMovementDataSchema

/**
 * @param `data`
 */

data class CharacterMovementResponseSchema(
    @JsonProperty("data")
    val `data`: CharacterMovementDataSchema,
)
