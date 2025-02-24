
package com.yqmonline.artifacts.sdk.models

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * @param `data` List of your characters.
 */

data class MyCharactersListSchema(
    // List of your characters.
    @JsonProperty("data")
    val `data`: List<CharacterSchema>,
)
