package com.yqmonline.artifacts.sdk.models.account.management

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.enums.CharacterSkin

/**
 * @param name Your desired character name. It's unique and all players can see it.
 * @param skin Your desired skin.
 */
data class AddCharacterSchema(
    // Your desired character name. It's unique and all players can see it.
    @JsonProperty("name")
    val name: String,
    // Your desired skin.
    @JsonProperty("skin")
    val skin: CharacterSkin,
)
