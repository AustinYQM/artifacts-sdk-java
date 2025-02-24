
package com.yqmonline.artifacts.sdk.models

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.items.DropRateSchema

/**
 * @param name Name of the monster.
 * @param code The code of the monster. This is the monster's unique identifier (ID).
 * @param level Monster level.
 * @param hp Monster hit points.
 * @param attackFire Monster fire attack.
 * @param attackEarth Monster earth attack.
 * @param attackWater Monster water attack.
 * @param attackAir Monster air attack.
 * @param resFire Monster % fire resistance.
 * @param resEarth Monster % earth resistance.
 * @param resWater Monster % water resistance.
 * @param resAir Monster % air resistance.
 * @param criticalStrike Monster % critical strike.
 * @param minGold Monster minimum gold drop.
 * @param maxGold Monster maximum gold drop.
 * @param drops Monster drops. This is a list of items that the monster drops after killing the monster.
 * @param effects List of effects.
 */

data class MonsterSchema(
    // Name of the monster.
    @JsonProperty("name")
    val name: String,
    // The code of the monster. This is the monster's unique identifier (ID).
    @JsonProperty("code")
    val code: String,
    // Monster level.
    @JsonProperty("level")
    val level: Int,
    // Monster hit points.
    @JsonProperty("hp")
    val hp: Int,
    // Monster fire attack.
    @JsonProperty("attack_fire")
    val attackFire: Int,
    // Monster earth attack.
    @JsonProperty("attack_earth")
    val attackEarth: Int,
    // Monster water attack.
    @JsonProperty("attack_water")
    val attackWater: Int,
    // Monster air attack.
    @JsonProperty("attack_air")
    val attackAir: Int,
    // Monster % fire resistance.
    @JsonProperty("res_fire")
    val resFire: Int,
    // Monster % earth resistance.
    @JsonProperty("res_earth")
    val resEarth: Int,
    // Monster % water resistance.
    @JsonProperty("res_water")
    val resWater: Int,
    // Monster % air resistance.
    @JsonProperty("res_air")
    val resAir: Int,
    // Monster % critical strike.
    @JsonProperty("critical_strike")
    val criticalStrike: Int,
    // Monster minimum gold drop.
    @JsonProperty("min_gold")
    val minGold: Int,
    // Monster maximum gold drop.
    @JsonProperty("max_gold")
    val maxGold: Int,
    // Monster drops. This is a list of items that the monster drops after killing the monster.
    @JsonProperty("drops")
    val drops: List<DropRateSchema>,
    // List of effects.
    @JsonProperty("effects")
    val effects: List<SimpleEffectSchema>? = null,
)
