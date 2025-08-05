package com.sahhiill.clashapi.models.player

import kotlinx.serialization.Serializable

@Serializable
data class Equipment(
    val level: Int,
    val name: String,
    val maxLevel: Int,
    val village: String
)