package com.yqmonline.artifacts.sdk.models.account.management

import com.fasterxml.jackson.annotation.JsonProperty
import kotlinx.serialization.Serializable

/**
 * @param currentPassword Your password.
 * @param newPassword New password.
 */

@Serializable
data class ChangePassword(
    // Your password.
    @JsonProperty("current_password")
    val currentPassword: String,
    // New password.
    @JsonProperty("new_password")
    val newPassword: String,
)
