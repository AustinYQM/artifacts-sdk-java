package com.yqmonline.artifacts.sdk.models.response.wrapper
import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.character.CharacterMovementDataSchema
import kotlinx.serialization.Serializable

/**
 * @param `data`
 */

@Serializable
data class CharacterMovementResponseSchema(
    @JsonProperty("data")
    val `data`: CharacterMovementDataSchema,
)
