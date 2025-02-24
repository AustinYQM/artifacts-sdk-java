package com.yqmonline.artifacts.sdk.models.response
import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.CharacterMovementDataSchema

/**
 * @param `data`
 */

data class CharacterMovementResponseSchema(
    @JsonProperty("data")
    val `data`: CharacterMovementDataSchema,
)
