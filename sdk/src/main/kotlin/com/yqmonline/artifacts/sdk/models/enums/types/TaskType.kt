
package com.yqmonline.artifacts.sdk.models.enums.types

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Values: monsters,items
 */

enum class TaskType(
    private val value: String,
) {
    @JsonProperty("monsters")
    MONSTERS("monsters"),

    @JsonProperty("items")
    ITEMS("items"),
    ;

    /**
     * Override [toString()] to avoid using the enum variable name as the value, and instead use
     * the actual value defined in the API spec file.
     *
     * This solves a problem when the variable name and its value are different, and ensures that
     * the client sends the correct enum values to the server always.
     */
    override fun toString(): String = value

    companion object {
        /**
         * Converts the provided [data] to a [String] on success, null otherwise.
         */
        fun encode(data: Any?): String? = if (data is TaskType) "$data" else null

        /**
         * Returns a valid [TaskType] for [data], null otherwise.
         */
        fun decode(data: Any?): TaskType? =
            data?.let {
                val normalizedData = "$it".lowercase()
                entries.firstOrNull { value ->
                    it == value || normalizedData == "$value".lowercase()
                }
            }
    }
}
