
package com.yqmonline.artifacts.sdk.models.response.wrapper

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.character.CharacterSchema

/**
 * @param `data` List of your characters.
 */

data class MyCharactersListSchema(
    // List of your characters.
    @JsonProperty("data")
    val `data`: List<CharacterSchema>,
)
