package com.yqmonline.artifacts.sdk.models

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * @param currentPassword Your password.
 * @param newPassword New password.
 */

data class ChangePassword(
    // Your password.
    @JsonProperty("current_password")
    val currentPassword: String,
    // New password.
    @JsonProperty("new_password")
    val newPassword: String,
)
