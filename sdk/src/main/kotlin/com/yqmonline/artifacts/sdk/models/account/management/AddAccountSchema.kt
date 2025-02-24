package com.yqmonline.artifacts.sdk.models.account.management

import com.fasterxml.jackson.annotation.JsonProperty
import kotlinx.serialization.Serializable

/**
 * @param username Your desired username.
 * @param password Your password.
 * @param email
 */
@Serializable
data class AddAccountSchema(
    // Your desired username.
    @JsonProperty("username")
    val username: String,
    // Your password.
    @JsonProperty("password")
    val password: String,
    @JsonProperty("email")
    val email: String? = null,
)
