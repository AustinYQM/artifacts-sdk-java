
package com.yqmonline.artifacts.sdk.models.task

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.CooldownSchema
import com.yqmonline.artifacts.sdk.models.character.CharacterSchema
import kotlinx.serialization.Serializable

/**
 * @param cooldown Cooldown details.
 * @param trade Reward details.
 * @param character Player details.
 */

@Serializable
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
