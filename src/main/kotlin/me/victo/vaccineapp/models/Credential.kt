package me.victo.vaccineapp.models

data class Credential(
    val userName : String,
    val passwordHash : String,
    val email : String
)
