package me.victo.vaccineapp.models

import me.victo.vaccineapp.models.utils.Location
import java.awt.Image

data class Patient(
    val id : Int,
    val firstName : String,
    val lastName : String,
    val cpf : String,
    val userId : Int,
    val medicinesUsing : List<Medicine>,
    val proofAddress : Image,
    val location : Location
)
