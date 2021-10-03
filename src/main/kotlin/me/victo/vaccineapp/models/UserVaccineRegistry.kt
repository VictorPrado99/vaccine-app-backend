package me.victo.vaccineapp.models

import java.util.*

data class UserVaccineRegistry(
    val id : Int,
    val userId : Int,
    val vaccineId : Int,
    val registryDate : Date
)
