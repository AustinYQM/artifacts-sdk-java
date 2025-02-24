
package com.yqmonline.artifacts.sdk.models.task

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.enums.types.TaskType
import kotlinx.serialization.Serializable

/**
 * @param code Task objective.
 * @param type The type of task.
 * @param total The total required to complete the task.
 * @param rewards Rewards for completing the task.
 */

@Serializable
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
