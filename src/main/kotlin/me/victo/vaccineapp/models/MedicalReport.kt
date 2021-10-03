package me.victo.vaccineapp.models

import org.jetbrains.annotations.Nullable

data class MedicalReport(
    @Nullable val id : Int,
    val doctorName : String,
    val CRM : String,
    val patientId : Int,
    val text : String
)
