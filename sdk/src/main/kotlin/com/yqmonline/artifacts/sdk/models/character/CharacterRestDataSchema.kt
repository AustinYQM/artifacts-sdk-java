package com.yqmonline.artifacts.sdk.models.character
import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.CooldownSchema

/**
 * @param cooldown Cooldown details
 * @param hpRestored The amount of HP restored.
 * @param character Character details.
 */

data class CharacterRestDataSchema(
    // Cooldown details
    @JsonProperty("cooldown")
    val cooldown: CooldownSchema,
    // The amount of HP restored.
    @JsonProperty("hp_restored")
    val hpRestored: Int,
    // Character details.
    @JsonProperty("character")
    val character: CharacterSchema,
)
