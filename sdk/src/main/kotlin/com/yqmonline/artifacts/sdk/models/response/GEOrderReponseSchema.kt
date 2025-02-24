
package com.yqmonline.artifacts.sdk.models.response

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.GEOrderSchema

/**
 * @param `data`
 */

data class GEOrderReponseSchema(
    @JsonProperty("data")
    val `data`: GEOrderSchema,
)
