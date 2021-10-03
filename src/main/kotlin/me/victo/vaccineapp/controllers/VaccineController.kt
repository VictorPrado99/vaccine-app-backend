package me.victo.vaccineapp.controllers

import me.victo.vaccineapp.models.User
import me.victo.vaccineapp.models.Vaccine
import me.victo.vaccineapp.services.VaccineService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/vaccine")
class VaccineController {

    @Autowired
    lateinit var vaccineService : VaccineService

    @PostMapping("/")
    fun getTakenVaccines (@RequestBody user : User) : ResponseEntity<List<Vaccine>>{
        return ResponseEntity<List<Vaccine>>(vaccineService.retrieveTakenVaccineByUser(user), HttpStatus.OK)
    }

}