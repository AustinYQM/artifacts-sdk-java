package com.yqmonline.artifacts.sdk.models.character

import com.fasterxml.jackson.annotation.JsonProperty
import kotlinx.serialization.Serializable

/**
 * @param position Position in the leaderboard.
 * @param name Character name.
 * @param account Account name.
 * @param skin Character skin code.
 * @param level Combat level.
 * @param totalXp Total XP of your character.
 * @param miningLevel Mining level.
 * @param miningTotalXp Mining total xp.
 * @param woodcuttingLevel Woodcutting level.
 * @param woodcuttingTotalXp Woodcutting total xp.
 * @param fishingLevel Fishing level.
 * @param fishingTotalXp Fishing total xp.
 * @param weaponcraftingLevel Weaponcrafting level.
 * @param weaponcraftingTotalXp Weaponcrafting total xp.
 * @param gearcraftingLevel Gearcrafting level.
 * @param gearcraftingTotalXp Gearcrafting total xp.
 * @param jewelrycraftingLevel Jewelrycrafting level.
 * @param jewelrycraftingTotalXp Jewelrycrafting total xp.
 * @param cookingLevel Cooking level.
 * @param cookingTotalXp Cooking total xp.
 * @param alchemyLevel Alchemy level.
 * @param alchemyTotalXp Alchemy total xp.
 * @param gold The numbers of gold on this character.
 */

@Serializable
data class CharacterLeaderboardSchema(
    // Position in the leaderboard.
    @JsonProperty("position")
    val position: Int,
    // Character name.
    @JsonProperty("name")
    val name: String,
    // Account name.
    @JsonProperty("account")
    val account: String,
    // Character skin code.
    @JsonProperty("skin")
    val skin: String,
    // Combat level.
    @JsonProperty("level")
    val level: Int,
    // Total XP of your character.
    @JsonProperty("total_xp")
    val totalXp: Int,
    // Mining level.
    @JsonProperty("mining_level")
    val miningLevel: Int,
    // Mining total xp.
    @JsonProperty("mining_total_xp")
    val miningTotalXp: Int,
    // Woodcutting level.
    @JsonProperty("woodcutting_level")
    val woodcuttingLevel: Int,
    // Woodcutting total xp.
    @JsonProperty("woodcutting_total_xp")
    val woodcuttingTotalXp: Int,
    // Fishing level.
    @JsonProperty("fishing_level")
    val fishingLevel: Int,
    // Fishing total xp.
    @JsonProperty("fishing_total_xp")
    val fishingTotalXp: Int,
    // Weaponcrafting level.
    @JsonProperty("weaponcrafting_level")
    val weaponcraftingLevel: Int,
    // Weaponcrafting total xp.
    @JsonProperty("weaponcrafting_total_xp")
    val weaponcraftingTotalXp: Int,
    // Gearcrafting level.
    @JsonProperty("gearcrafting_level")
    val gearcraftingLevel: Int,
    // Gearcrafting total xp.
    @JsonProperty("gearcrafting_total_xp")
    val gearcraftingTotalXp: Int,
    // Jewelrycrafting level.
    @JsonProperty("jewelrycrafting_level")
    val jewelrycraftingLevel: Int,
    // Jewelrycrafting total xp.
    @JsonProperty("jewelrycrafting_total_xp")
    val jewelrycraftingTotalXp: Int,
    // Cooking level.
    @JsonProperty("cooking_level")
    val cookingLevel: Int,
    // Cooking total xp.
    @JsonProperty("cooking_total_xp")
    val cookingTotalXp: Int,
    // Alchemy level.
    @JsonProperty("alchemy_level")
    val alchemyLevel: Int,
    // Alchemy total xp.
    @JsonProperty("alchemy_total_xp")
    val alchemyTotalXp: Int,
    // The numbers of gold on this character.
    @JsonProperty("gold")
    val gold: Int,
)
