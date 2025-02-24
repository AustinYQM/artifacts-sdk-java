package com.yqmonline.artifacts.sdk.enums

import com.fasterxml.jackson.annotation.JsonProperty

enum class AccountStatus(
    private val value: String,
) {
    @JsonProperty("standard")
    STANDARD("standard"),

    @JsonProperty("founder")
    FOUNDER("founder"),

    @JsonProperty("gold_founder")
    GOLD_FOUNDER("gold_founder"),

    @JsonProperty("vip_founder")
    VIP_FOUNDER("vip_founder"),
    ;

    /**
     * Override [toString()] to avoid using the enum variable name as the value, and instead use
     * the actual value defined in the API spec file.
     *
     * This solves a problem when the variable name and its value are different, and ensures that
     * the client sends the correct enum values to the server always.
     */
    override fun toString(): kotlin.String = value

    companion object {
        /**
         * Converts the provided [data] to a [String] on success, null otherwise.
         */
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is AccountStatus) "$data" else null

        /**
         * Returns a valid [AccountStatus] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): AccountStatus? =
            data?.let {
                val normalizedData = "$it".lowercase()
                entries.firstOrNull { value ->
                    it == value || normalizedData == "$value".lowercase()
                }
            }
    }
}
