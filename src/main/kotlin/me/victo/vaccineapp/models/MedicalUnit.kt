package me.victo.vaccineapp.models

data class MedicalUnit(
    val id : Int,
    val medicalUnitName : String,
    val avaibleVaccine: List<Vaccine>
)