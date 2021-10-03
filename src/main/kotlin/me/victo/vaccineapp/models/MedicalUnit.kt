package me.victo.vaccineapp.models

import me.victo.vaccineapp.models.utils.Location
import org.jetbrains.annotations.Nullable

data class MedicalUnit(
    @Nullable val id : Int,
    val medicalUnitName : String,
    val availableVaccine: List<Vaccine>,
    val availableMedicine : List<Medicine>,
    val location : Location
)