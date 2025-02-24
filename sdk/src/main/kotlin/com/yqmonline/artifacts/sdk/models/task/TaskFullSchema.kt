
package com.yqmonline.artifacts.sdk.models.task

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.enums.types.TaskType

/**
 * @param code Task objective.
 * @param level Task level.
 * @param type The type of task.
 * @param minQuantity Minimum amount of task.
 * @param maxQuantity Maximum amount of task.
 * @param skill
 * @param rewards Rewards.
 */

data class TaskFullSchema(
    // Task objective.
    @JsonProperty("code")
    val code: String,
    // Task level.
    @JsonProperty("level")
    val level: Int,
    // The type of task.
    @JsonProperty("type")
    val type: TaskType,
    // Minimum amount of task.
    @JsonProperty("min_quantity")
    val minQuantity: Int,
    // Maximum amount of task.
    @JsonProperty("max_quantity")
    val maxQuantity: Int,
    @JsonProperty("skill")
    val skill: String?,
    // Rewards.
    @JsonProperty("rewards")
    val rewards: RewardsSchema,
)
