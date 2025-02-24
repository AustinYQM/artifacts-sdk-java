
package com.yqmonline.artifacts.sdk.models.skill

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.CooldownSchema
import com.yqmonline.artifacts.sdk.models.character.CharacterSchema
import kotlinx.serialization.Serializable

/**
 * @param cooldown Cooldown details.
 * @param details Craft details.
 * @param character Player details.
 */

@Serializable
data class SkillDataSchema(
    // Cooldown details.
    @JsonProperty("cooldown")
    val cooldown: CooldownSchema,
    // Craft details.
    @JsonProperty("details")
    val details: SkillInfoSchema,
    // Player details.
    @JsonProperty("character")
    val character: CharacterSchema,
)
