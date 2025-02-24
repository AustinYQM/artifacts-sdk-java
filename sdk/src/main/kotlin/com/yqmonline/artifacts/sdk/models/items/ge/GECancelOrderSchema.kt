

package com.yqmonline.artifacts.sdk.models.items.ge

import com.fasterxml.jackson.annotation.JsonProperty
import kotlinx.serialization.Serializable

/**
 * @param id Order id.
 */

@Serializable
data class GECancelOrderSchema(
    // Order id.
    @JsonProperty("id")
    val id: String,
)
