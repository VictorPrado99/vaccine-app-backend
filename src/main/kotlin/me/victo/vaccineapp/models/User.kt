package me.victo.vaccineapp.models

import org.jetbrains.annotations.Nullable

data class User(
    @Nullable val id : Int,
    val userName : String
)
