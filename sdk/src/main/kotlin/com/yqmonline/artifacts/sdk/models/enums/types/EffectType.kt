
package com.yqmonline.artifacts.sdk.models.enums.types

import com.fasterxml.jackson.annotation.JsonProperty
import kotlinx.serialization.Serializable

/**
 * Values: equipment,consumable,combat,item
 */
@Serializable
enum class EffectType(
    private val value: String,
) {
    @JsonProperty("equipment")
    EQUIPMENT("equipment"),

    @JsonProperty("consumable")
    CONSUMABLE("consumable"),

    @JsonProperty("combat")
    COMBAT("combat"),

    @JsonProperty("item")
    ITEM("item"),
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
        fun encode(data: Any?): String? = if (data is EffectType) "$data" else null

        /**
         * Returns a valid [EffectType] for [data], null otherwise.
         */
        fun decode(data: Any?): EffectType? =
            data?.let {
                val normalizedData = "$it".lowercase()
                entries.firstOrNull { value ->
                    it == value || normalizedData == "$value".lowercase()
                }
            }
    }
}
