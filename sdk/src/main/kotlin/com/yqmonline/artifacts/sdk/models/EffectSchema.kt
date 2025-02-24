
package com.yqmonline.artifacts.sdk.models

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.enums.types.EffectSubtype
import com.yqmonline.artifacts.sdk.models.enums.types.EffectType
import kotlinx.serialization.Serializable

/**
 * @param name Name of the monster.
 * @param code The code of the effect. This is the effect's unique identifier (ID).
 * @param description Description of the effect. This is a brief description of the effect.
 * @param type Type of the effect.
 * @param subtype Subtype of the effect.
 */

@Serializable
data class EffectSchema(
    // Name of the monster.
    @JsonProperty("name")
    val name: String,
    // The code of the effect. This is the effect's unique identifier (ID).
    @JsonProperty("code")
    val code: String,
    // Description of the effect. This is a brief description of the effect.
    @JsonProperty("description")
    val description: String,
    // Type of the effect.
    @JsonProperty("type")
    val type: EffectType,
    // Subtype of the effect.
    @JsonProperty("subtype")
    val subtype: EffectSubtype,
)
