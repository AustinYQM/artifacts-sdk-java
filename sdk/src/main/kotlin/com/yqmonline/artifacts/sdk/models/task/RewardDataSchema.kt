
package com.yqmonline.artifacts.sdk.models.task

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.CooldownSchema
import com.yqmonline.artifacts.sdk.models.character.CharacterSchema

/**
 * @param cooldown Cooldown details.
 * @param rewards Reward details.
 * @param character Player details.
 */

data class RewardDataSchema(
    // Cooldown details.
    @JsonProperty("cooldown")
    val cooldown: CooldownSchema,
    // Reward details.
    @JsonProperty("rewards")
    val rewards: RewardsSchema,
    // Player details.
    @JsonProperty("character")
    val character: CharacterSchema,
)
