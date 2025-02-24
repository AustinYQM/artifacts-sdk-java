package com.yqmonline.artifacts.sdk.models.character

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.CooldownSchema
import com.yqmonline.artifacts.sdk.models.map.MapSchema
import kotlinx.serialization.Serializable

/**
 * @param cooldown Cooldown details
 * @param destination Destination details.
 * @param character Character details.
 */

@Serializable
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
