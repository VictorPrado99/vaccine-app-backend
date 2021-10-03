package me.victo.vaccineapp.controllers

import me.victo.vaccineapp.models.MedicalUnit
import me.victo.vaccineapp.models.Medicine
import me.victo.vaccineapp.models.utils.Location
import me.victo.vaccineapp.services.MedicalUnitService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/medicalUnit")
class MedicalUnitController {

    @Autowired
    lateinit var medicalUnitService: MedicalUnitService

    @GetMapping("/getClosest")
    fun getClosestMedicalUnit(location : Location) : ResponseEntity<MedicalUnit>{
        return ResponseEntity<MedicalUnit>(medicalUnitService.getClosestMedicalUnit(location), HttpStatus.OK)
    }

    @GetMapping("/queryMedicine")
    fun queryMedicineAvailable(@RequestBody medicine: Medicine) : ResponseEntity<List<MedicalUnit>>{
        return ResponseEntity<List<MedicalUnit>>(medicalUnitService.getMedicalUnitWithMedicineAvailable(medicine), HttpStatus.OK)
    }

    @PostMapping("/registerNewMedicalUnit")
    fun registerMedicalUnit(@RequestBody medicalUnit: MedicalUnit) : ResponseEntity<MedicalUnit>{
        return ResponseEntity<MedicalUnit>(HttpStatus.CREATED)
    }


}