
package com.yqmonline.artifacts.sdk.models.response.wrapper

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.character.CharacterSchema
import kotlinx.serialization.Serializable

/**
 * @param `data` List of your characters.
 */

@Serializable
data class MyCharactersListSchema(
    // List of your characters.
    @JsonProperty("data")
    val `data`: List<CharacterSchema>,
)
