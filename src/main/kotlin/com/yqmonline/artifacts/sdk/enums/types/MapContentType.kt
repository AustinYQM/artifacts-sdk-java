
package com.yqmonline.artifacts.sdk.enums.types

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Values: monster,resource,workshop,bank,grand_exchange,tasks_master,npc
 */

enum class MapContentType(
    private val value: String,
) {
    @JsonProperty("monster")
    MONSTER("monster"),

    @JsonProperty("resource")
    RESOURCE("resource"),

    @JsonProperty("workshop")
    WORKSHOP("workshop"),

    @JsonProperty("bank")
    BANK("bank"),

    @JsonProperty("grand_exchange")
    GRAND_EXCHANGE("grand_exchange"),

    @JsonProperty("tasks_master")
    TASKS_MASTER("tasks_master"),

    @JsonProperty("npc")
    NPC("npc"),
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
        fun encode(data: Any?): String? = if (data is MapContentType) "$data" else null

        /**
         * Returns a valid [MapContentType] for [data], null otherwise.
         */
        fun decode(data: Any?): MapContentType? =
            data?.let {
                val normalizedData = "$it".lowercase()
                entries.firstOrNull { value ->
                    it == value || normalizedData == "$value".lowercase()
                }
            }
    }
}
