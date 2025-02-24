package com.yqmonline.artifacts.sdk.models.combat

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.enums.FightResult
import com.yqmonline.artifacts.sdk.models.items.inventory.DropSchema

/**
 * @param xp The amount of xp gained from the fight.
 * @param gold The amount of gold gained from the fight.
 * @param drops The items dropped from the fight.
 * @param turns Numbers of the turns of the combat.
 * @param monsterBlockedHits The amount of blocked hits by the monster.
 * @param playerBlockedHits The amount of blocked hits by the player.
 * @param logs The fight logs.
 * @param result The result of the fight.
 */

data class FightSchema(
    // The amount of xp gained from the fight.
    @JsonProperty("xp")
    val xp: Int,
    // The amount of gold gained from the fight.
    @JsonProperty("gold")
    val gold: Int,
    // The items dropped from the fight.
    @JsonProperty("drops")
    val drops: List<DropSchema>,
    // Numbers of the turns of the combat.
    @JsonProperty("turns")
    val turns: Int,
    // The amount of blocked hits by the monster.
    @JsonProperty("monster_blocked_hits")
    val monsterBlockedHits: BlockedHitsSchema,
    // The amount of blocked hits by the player.
    @JsonProperty("player_blocked_hits")
    val playerBlockedHits: BlockedHitsSchema,
    // The fight logs.
    @JsonProperty("logs")
    val logs: List<String>,
    // The result of the fight.
    @JsonProperty("result")
    val result: FightResult,
)
