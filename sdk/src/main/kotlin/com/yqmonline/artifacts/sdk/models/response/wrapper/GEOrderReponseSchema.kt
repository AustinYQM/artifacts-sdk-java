
package com.yqmonline.artifacts.sdk.models.response.wrapper

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.items.ge.GEOrderSchema

/**
 * @param `data`
 */

data class GEOrderReponseSchema(
    @JsonProperty("data")
    val `data`: GEOrderSchema,
)
