
package com.yqmonline.artifacts.sdk.models

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * @param cooldown Cooldown details.
 * @param details Craft details.
 * @param character Player details.
 */

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
