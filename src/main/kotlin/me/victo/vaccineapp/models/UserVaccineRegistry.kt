package me.victo.vaccineapp.models

import org.jetbrains.annotations.Nullable
import java.util.*

data class UserVaccineRegistry(
    @Nullable val id : Int,
    val userId : Int,
    val vaccineId : Int,
    val registryDate : Date
)
