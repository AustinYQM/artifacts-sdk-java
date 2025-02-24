package com.yqmonline.artifacts.sdk.models.account.management

import com.fasterxml.jackson.annotation.JsonProperty
import kotlinx.serialization.Serializable

/**
 * @param name Character name.
 */

@Serializable
data class DeleteCharacterSchema(
    // Character name.
    @JsonProperty("name")
    val name: String,
)
