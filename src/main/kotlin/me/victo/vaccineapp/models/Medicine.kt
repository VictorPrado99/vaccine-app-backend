package me.victo.vaccineapp.models

import org.jetbrains.annotations.Nullable

data class Medicine(
    @Nullable val id : Int,
    val medicineName : String
)
