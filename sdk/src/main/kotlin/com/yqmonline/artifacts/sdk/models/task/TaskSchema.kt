
package com.yqmonline.artifacts.sdk.models.task

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.enums.types.TaskType

/**
 * @param code Task objective.
 * @param type The type of task.
 * @param total The total required to complete the task.
 * @param rewards Rewards for completing the task.
 */

data class TaskSchema(
    // Task objective.
    @JsonProperty("code")
    val code: String,
    // The type of task.
    @JsonProperty("type")
    val type: TaskType,
    // The total required to complete the task.
    @JsonProperty("total")
    val total: Int,
    // Rewards for completing the task.
    @JsonProperty("rewards")
    val rewards: RewardsSchema,
)
