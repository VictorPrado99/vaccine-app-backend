package me.victo.vaccineapp.models

import org.jetbrains.annotations.Nullable

data class Vaccine(
    @Nullable val id : Int,
    val vaccineName : String,
    val timeBetweenDosesInDays : Int
)
