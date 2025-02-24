
package com.yqmonline.artifacts.sdk.models

import com.fasterxml.jackson.annotation.JsonProperty

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
