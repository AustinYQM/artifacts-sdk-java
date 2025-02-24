package com.yqmonline.artifacts.sdk.models
import com.fasterxml.jackson.annotation.JsonProperty

/**
 * @param cooldown Cooldown details
 * @param destination Destination details.
 * @param character Character details.
 */

data class CharacterMovementDataSchema(
    // Cooldown details
    @JsonProperty("cooldown")
    val cooldown: CooldownSchema,
    // Destination details.
    @JsonProperty("destination")
    val destination: MapSchema,
    // Character details.
    @JsonProperty("character")
    val character: CharacterSchema,
)
