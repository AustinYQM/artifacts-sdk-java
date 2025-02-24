package com.yqmonline.artifacts.sdk.models.account.management

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * @param name Character name.
 */

data class DeleteCharacterSchema(
    // Character name.
    @JsonProperty("name")
    val name: String,
)
