package me.victo.vaccineapp.controllers

import me.victo.vaccineapp.models.Medicine
import me.victo.vaccineapp.models.User
import me.victo.vaccineapp.models.Vaccine
import me.victo.vaccineapp.services.VaccineService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*

@Controller
@RequestMapping("/vaccines")
class VaccineController {

    @Autowired
    lateinit var vaccineService : VaccineService

    @GetMapping("/getTakenVaccines")
    fun getTakenVaccines (@RequestBody user : User) : ResponseEntity<List<Vaccine>>{
        return ResponseEntity<List<Vaccine>>(vaccineService.retrieveTakenVaccineByUser(user), HttpStatus.OK)
    }

    @GetMapping("/retrieveVaccinesUserShouldReceive")
    fun retrieveVaccinesUserShouldReceive (@RequestBody user : User) : ResponseEntity<List<Vaccine>>{
        return ResponseEntity<List<Vaccine>>(vaccineService.retrieveVaccinesUserShouldReceive(user), HttpStatus.OK)
    }

    @PostMapping("/registerNewVaccine")
    fun registerNewVaccine (@RequestBody vaccine : Vaccine) : ResponseEntity<Vaccine>{
        return ResponseEntity<Vaccine>(HttpStatus.CREATED)
    }

    @PostMapping("/registerAvailableVaccineAt/{medical_unit_id}")
    fun registerAvailableMedicine(
        @PathVariable(name = "medical_unit_id") medicalUnitId : Int,
        @RequestBody vaccines: List<Vaccine>
    ): ResponseEntity<Unit> {
        vaccineService.updateVaccineStockAt(medicalUnitId, vaccines)
        return ResponseEntity(HttpStatus.ACCEPTED)
    }

}