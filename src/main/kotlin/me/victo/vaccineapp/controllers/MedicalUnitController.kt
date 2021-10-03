package me.victo.vaccineapp.controllers

import me.victo.vaccineapp.models.MedicalUnit
import me.victo.vaccineapp.services.MedicalUnitService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/medicalUnit")
class MedicalUnitController {

    @Autowired
    lateinit var medicalUnitService: MedicalUnitService

//    fun getClosestMedicalUnit() : ResponseEntity<MedicalUnit>{
//        return
//    }


}