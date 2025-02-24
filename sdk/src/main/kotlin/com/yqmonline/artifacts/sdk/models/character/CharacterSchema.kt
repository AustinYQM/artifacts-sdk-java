package com.yqmonline.artifacts.sdk.models.character
import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.enums.CharacterSkin
import com.yqmonline.artifacts.sdk.models.items.inventory.InventorySlot
import java.time.OffsetDateTime

/**
 * @param name Name of the character.
 * @param account Account name.
 * @param skin Character skin code.
 * @param level Combat level.
 * @param xp The current xp level of the combat level.
 * @param maxXp XP required to level up the character.
 * @param gold The numbers of gold on this character.
 * @param speed *Not available, on the roadmap. Character movement speed.
 * @param miningLevel Mining level.
 * @param miningXp The current xp level of the Mining skill.
 * @param miningMaxXp Mining XP required to level up the skill.
 * @param woodcuttingLevel Woodcutting level.
 * @param woodcuttingXp The current xp level of the Woodcutting skill.
 * @param woodcuttingMaxXp Woodcutting XP required to level up the skill.
 * @param fishingLevel Fishing level.
 * @param fishingXp The current xp level of the Fishing skill.
 * @param fishingMaxXp Fishing XP required to level up the skill.
 * @param weaponcraftingLevel Weaponcrafting level.
 * @param weaponcraftingXp The current xp level of the Weaponcrafting skill.
 * @param weaponcraftingMaxXp Weaponcrafting XP required to level up the skill.
 * @param gearcraftingLevel Gearcrafting level.
 * @param gearcraftingXp The current xp level of the Gearcrafting skill.
 * @param gearcraftingMaxXp Gearcrafting XP required to level up the skill.
 * @param jewelrycraftingLevel Jewelrycrafting level.
 * @param jewelrycraftingXp The current xp level of the Jewelrycrafting skill.
 * @param jewelrycraftingMaxXp Jewelrycrafting XP required to level up the skill.
 * @param cookingLevel The current xp level of the Cooking skill.
 * @param cookingXp Cooking XP.
 * @param cookingMaxXp Cooking XP required to level up the skill.
 * @param alchemyLevel Alchemy level.
 * @param alchemyXp Alchemy XP.
 * @param alchemyMaxXp Alchemy XP required to level up the skill.
 * @param hp Character actual HP.
 * @param maxHp Character max HP.
 * @param haste *Increase speed attack (reduce fight cooldown)
 * @param criticalStrike % Critical strike. Critical strikes adds 50% extra damage to an attack (1.5x).
 * @param wisdom Wisdom increases the amount of XP gained from fights (1% extra per 10 wisdom).
 * @param prospecting Prospecting increases the chances of getting better loot (1% extra per 10 PP).
 * @param attackFire Fire attack.
 * @param attackEarth Earth attack.
 * @param attackWater Water attack.
 * @param attackAir Air attack.
 * @param dmg % Damage. Damage increases your attack in all elements.
 * @param dmgFire % Fire damage. Damage increases your fire attack.
 * @param dmgEarth % Earth damage. Damage increases your earth attack.
 * @param dmgWater % Water damage. Damage increases your water attack.
 * @param dmgAir % Air damage. Damage increases your air attack.
 * @param resFire % Fire resistance. Reduces fire attack.
 * @param resEarth % Earth resistance. Reduces earth attack.
 * @param resWater % Water resistance. Reduces water attack.
 * @param resAir % Air resistance. Reduces air attack.
 * @param x Character x coordinate.
 * @param y Character y coordinate.
 * @param cooldown Cooldown in seconds.
 * @param weaponSlot Weapon slot.
 * @param runeSlot Rune slot.
 * @param shieldSlot Shield slot.
 * @param helmetSlot Helmet slot.
 * @param bodyArmorSlot Body armor slot.
 * @param legArmorSlot Leg armor slot.
 * @param bootsSlot Boots slot.
 * @param ring1Slot Ring 1 slot.
 * @param ring2Slot Ring 2 slot.
 * @param amuletSlot Amulet slot.
 * @param artifact1Slot Artifact 1 slot.
 * @param artifact2Slot Artifact 2 slot.
 * @param artifact3Slot Artifact 3 slot.
 * @param utility1Slot Utility 1 slot.
 * @param utility1SlotQuantity Utility 1 quantity.
 * @param utility2Slot Utility 2 slot.
 * @param utility2SlotQuantity Utility 2 quantity.
 * @param bagSlot Bag slot.
 * @param task Task in progress.
 * @param taskType Task type.
 * @param taskProgress Task progression.
 * @param taskTotal Task total objective.
 * @param inventoryMaxItems Inventory max items.
 * @param cooldownExpiration Datetime Cooldown expiration.
 * @param inventory List of inventory slots.
 */

data class CharacterSchema(
    // Name of the character.
    @JsonProperty("name")
    val name: String,
    // Account name.
    @JsonProperty("account")
    val account: String,
    // Character skin code.
    @JsonProperty("skin")
    val skin: CharacterSkin,
    // Combat level.
    @JsonProperty("level")
    val level: Int,
    // The current xp level of the combat level.
    @JsonProperty("xp")
    val xp: Int,
    // XP required to level up the character.
    @JsonProperty("max_xp")
    val maxXp: Int,
    // The numbers of gold on this character.
    @JsonProperty("gold")
    val gold: Int,
    // *Not available, on the roadmap. Character movement speed.
    @JsonProperty("speed")
    val speed: Int,
    // Mining level.
    @JsonProperty("mining_level")
    val miningLevel: Int,
    // The current xp level of the Mining skill.
    @JsonProperty("mining_xp")
    val miningXp: Int,
    // Mining XP required to level up the skill.
    @JsonProperty("mining_max_xp")
    val miningMaxXp: Int,
    // Woodcutting level.
    @JsonProperty("woodcutting_level")
    val woodcuttingLevel: Int,
    // The current xp level of the Woodcutting skill.
    @JsonProperty("woodcutting_xp")
    val woodcuttingXp: Int,
    // Woodcutting XP required to level up the skill.
    @JsonProperty("woodcutting_max_xp")
    val woodcuttingMaxXp: Int,
    // Fishing level.
    @JsonProperty("fishing_level")
    val fishingLevel: Int,
    // The current xp level of the Fishing skill.
    @JsonProperty("fishing_xp")
    val fishingXp: Int,
    // Fishing XP required to level up the skill.
    @JsonProperty("fishing_max_xp")
    val fishingMaxXp: Int,
    // Weaponcrafting level.
    @JsonProperty("weaponcrafting_level")
    val weaponcraftingLevel: Int,
    // The current xp level of the Weaponcrafting skill.
    @JsonProperty("weaponcrafting_xp")
    val weaponcraftingXp: Int,
    // Weaponcrafting XP required to level up the skill.
    @JsonProperty("weaponcrafting_max_xp")
    val weaponcraftingMaxXp: Int,
    // Gearcrafting level.
    @JsonProperty("gearcrafting_level")
    val gearcraftingLevel: Int,
    // The current xp level of the Gearcrafting skill.
    @JsonProperty("gearcrafting_xp")
    val gearcraftingXp: Int,
    // Gearcrafting XP required to level up the skill.
    @JsonProperty("gearcrafting_max_xp")
    val gearcraftingMaxXp: Int,
    // Jewelrycrafting level.
    @JsonProperty("jewelrycrafting_level")
    val jewelrycraftingLevel: Int,
    // The current xp level of the Jewelrycrafting skill.
    @JsonProperty("jewelrycrafting_xp")
    val jewelrycraftingXp: Int,
    // Jewelrycrafting XP required to level up the skill.
    @JsonProperty("jewelrycrafting_max_xp")
    val jewelrycraftingMaxXp: Int,
    // The current xp level of the Cooking skill.
    @JsonProperty("cooking_level")
    val cookingLevel: Int,
    // Cooking XP.
    @JsonProperty("cooking_xp")
    val cookingXp: Int,
    // Cooking XP required to level up the skill.
    @JsonProperty("cooking_max_xp")
    val cookingMaxXp: Int,
    // Alchemy level.
    @JsonProperty("alchemy_level")
    val alchemyLevel: Int,
    // Alchemy XP.
    @JsonProperty("alchemy_xp")
    val alchemyXp: Int,
    // Alchemy XP required to level up the skill.
    @JsonProperty("alchemy_max_xp")
    val alchemyMaxXp: Int,
    // Character actual HP.
    @JsonProperty("hp")
    val hp: Int,
    // Character max HP.
    @JsonProperty("max_hp")
    val maxHp: Int,
    // *Increase speed attack (reduce fight cooldown)
    @JsonProperty("haste")
    val haste: Int,
    // % Critical strike. Critical strikes adds 50% extra damage to an attack (1.5x).
    @JsonProperty("critical_strike")
    val criticalStrike: Int,
    // Wisdom increases the amount of XP gained from fights (1% extra per 10 wisdom).
    @JsonProperty("wisdom")
    val wisdom: Int,
    // Prospecting increases the chances of getting better loot (1% extra per 10 PP).
    @JsonProperty("prospecting")
    val prospecting: Int,
    // Fire attack.
    @JsonProperty("attack_fire")
    val attackFire: Int,
    // Earth attack.
    @JsonProperty("attack_earth")
    val attackEarth: Int,
    // Water attack.
    @JsonProperty("attack_water")
    val attackWater: Int,
    // Air attack.
    @JsonProperty("attack_air")
    val attackAir: Int,
    // % Damage. Damage increases your attack in all elements.
    @JsonProperty("dmg")
    val dmg: Int,
    // % Fire damage. Damage increases your fire attack.
    @JsonProperty("dmg_fire")
    val dmgFire: Int,
    // % Earth damage. Damage increases your earth attack.
    @JsonProperty("dmg_earth")
    val dmgEarth: Int,
    // % Water damage. Damage increases your water attack.
    @JsonProperty("dmg_water")
    val dmgWater: Int,
    // % Air damage. Damage increases your air attack.
    @JsonProperty("dmg_air")
    val dmgAir: Int,
    // % Fire resistance. Reduces fire attack.
    @JsonProperty("res_fire")
    val resFire: Int,
    // % Earth resistance. Reduces earth attack.
    @JsonProperty("res_earth")
    val resEarth: Int,
    // % Water resistance. Reduces water attack.
    @JsonProperty("res_water")
    val resWater: Int,
    // % Air resistance. Reduces air attack.
    @JsonProperty("res_air")
    val resAir: Int,
    // Character x coordinate.
    @JsonProperty("x")
    val x: Int,
    // Character y coordinate.
    @JsonProperty("y")
    val y: Int,
    // Cooldown in seconds.
    @JsonProperty("cooldown")
    val cooldown: Int,
    // Weapon slot.
    @JsonProperty("weapon_slot")
    val weaponSlot: String,
    // Rune slot.
    @JsonProperty("rune_slot")
    val runeSlot: String,
    // Shield slot.
    @JsonProperty("shield_slot")
    val shieldSlot: String,
    // Helmet slot.
    @JsonProperty("helmet_slot")
    val helmetSlot: String,
    // Body armor slot.
    @JsonProperty("body_armor_slot")
    val bodyArmorSlot: String,
    // Leg armor slot.
    @JsonProperty("leg_armor_slot")
    val legArmorSlot: String,
    // Boots slot.
    @JsonProperty("boots_slot")
    val bootsSlot: String,
    // Ring 1 slot.
    @JsonProperty("ring1_slot")
    val ring1Slot: String,
    // Ring 2 slot.
    @JsonProperty("ring2_slot")
    val ring2Slot: String,
    // Amulet slot.
    @JsonProperty("amulet_slot")
    val amuletSlot: String,
    // Artifact 1 slot.
    @JsonProperty("artifact1_slot")
    val artifact1Slot: String,
    // Artifact 2 slot.
    @JsonProperty("artifact2_slot")
    val artifact2Slot: String,
    // Artifact 3 slot.
    @JsonProperty("artifact3_slot")
    val artifact3Slot: String,
    // Utility 1 slot.
    @JsonProperty("utility1_slot")
    val utility1Slot: String,
    // Utility 1 quantity.
    @JsonProperty("utility1_slot_quantity")
    val utility1SlotQuantity: Int,
    // Utility 2 slot.
    @JsonProperty("utility2_slot")
    val utility2Slot: String,
    // Utility 2 quantity.
    @JsonProperty("utility2_slot_quantity")
    val utility2SlotQuantity: Int,
    // Bag slot.
    @JsonProperty("bag_slot")
    val bagSlot: String,
    // Task in progress.
    @JsonProperty("task")
    val task: String,
    // Task type.
    @JsonProperty("task_type")
    val taskType: String,
    // Task progression.
    @JsonProperty("task_progress")
    val taskProgress: Int,
    // Task total objective.
    @JsonProperty("task_total")
    val taskTotal: Int,
    // Inventory max items.
    @JsonProperty("inventory_max_items")
    val inventoryMaxItems: Int,
    // Datetime Cooldown expiration.
    @JsonProperty("cooldown_expiration")
    val cooldownExpiration: OffsetDateTime? = null,
    // List of inventory slots.
    @JsonProperty("inventory")
    val inventory: List<InventorySlot>? = null,
)
