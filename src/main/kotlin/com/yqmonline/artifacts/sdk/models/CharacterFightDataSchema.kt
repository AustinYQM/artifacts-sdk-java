package com.yqmonline.artifacts.sdk.models

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * @param cooldown Cooldown details.
 * @param fight Fight details.
 * @param character Player details.
 */

data class CharacterFightDataSchema(
    // Cooldown details.
    @JsonProperty("cooldown")
    val cooldown: CooldownSchema,
    // Fight details.
    @JsonProperty("fight")
    val fight: FightSchema,
    // Player details.
    @JsonProperty("character")
    val character: CharacterSchema,
)
