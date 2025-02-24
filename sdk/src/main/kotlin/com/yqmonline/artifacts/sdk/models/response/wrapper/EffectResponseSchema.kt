
package com.yqmonline.artifacts.sdk.models.response.wrapper

import com.fasterxml.jackson.annotation.JsonProperty
import com.yqmonline.artifacts.sdk.models.EffectSchema

/**
 * @param `data`
 */

data class EffectResponseSchema(
    @JsonProperty("data")
    val `data`: EffectSchema,
)
