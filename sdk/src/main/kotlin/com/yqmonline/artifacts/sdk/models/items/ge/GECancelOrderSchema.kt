

package com.yqmonline.artifacts.sdk.models.items.ge

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * @param id Order id.
 */

data class GECancelOrderSchema(
    // Order id.
    @JsonProperty("id")
    val id: String,
)
