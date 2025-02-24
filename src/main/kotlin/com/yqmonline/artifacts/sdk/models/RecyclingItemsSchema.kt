
package com.yqmonline.artifacts.sdk.models

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * @param items Objects received.
 */

data class RecyclingItemsSchema(
    // Objects received.
    @JsonProperty("items")
    val items: List<DropSchema>,
)
