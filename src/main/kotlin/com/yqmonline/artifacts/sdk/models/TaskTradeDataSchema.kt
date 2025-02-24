
package com.yqmonline.artifacts.sdk.models

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * @param cooldown Cooldown details.
 * @param trade Reward details.
 * @param character Player details.
 */

data class TaskTradeDataSchema(
    // Cooldown details.
    @JsonProperty("cooldown")
    val cooldown: CooldownSchema,
    // Reward details.
    @JsonProperty("trade")
    val trade: TaskTradeSchema,
    // Player details.
    @JsonProperty("character")
    val character: CharacterSchema,
)
