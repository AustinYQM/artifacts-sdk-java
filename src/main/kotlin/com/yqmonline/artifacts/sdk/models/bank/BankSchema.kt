package com.yqmonline.artifacts.sdk.models.bank

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * @param slots Maximum slots in your bank.
 * @param expansions Bank expansions.
 * @param nextExpansionCost Next expansion cost.
 * @param gold Quantity of gold in your bank.
 */

data class BankSchema(
    // Maximum slots in your bank.
    @JsonProperty("slots")
    val slots: Int,
    // Bank expansions.
    @JsonProperty("expansions")
    val expansions: Int,
    // Next expansion cost.
    @JsonProperty("next_expansion_cost")
    val nextExpansionCost: Int,
    // Quantity of gold in your bank.
    @JsonProperty("gold")
    val gold: Int,
)
