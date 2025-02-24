
package com.yqmonline.artifacts.sdk.models

import com.fasterxml.jackson.annotation.JsonProperty

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
