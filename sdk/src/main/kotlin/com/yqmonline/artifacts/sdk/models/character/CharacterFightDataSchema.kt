package com.yqmonline.artifacts.sdk.models.character

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.CooldownSchema
import com.yqmonline.artifacts.sdk.models.combat.FightSchema

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
