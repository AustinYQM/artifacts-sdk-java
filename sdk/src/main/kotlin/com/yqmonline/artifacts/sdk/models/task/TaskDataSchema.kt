
package com.yqmonline.artifacts.sdk.models.task

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.CooldownSchema
import com.yqmonline.artifacts.sdk.models.character.CharacterSchema

/**
 * @param cooldown Cooldown details.
 * @param task Task details.
 * @param character Player details.
 */

data class TaskDataSchema(
    // Cooldown details.
    @JsonProperty("cooldown")
    val cooldown: CooldownSchema,
    // Task details.
    @JsonProperty("task")
    val task: TaskSchema,
    // Player details.
    @JsonProperty("character")
    val character: CharacterSchema,
)
