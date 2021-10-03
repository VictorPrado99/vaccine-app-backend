package me.victo.vaccineapp.controllers

import me.victo.vaccineapp.models.MedicalReport
import me.victo.vaccineapp.services.MedicalReportService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/reports")
class MedicalReportController {

    @Autowired
    lateinit var medicalReportService : MedicalReportService

    @GetMapping("/getReport/{report_id}")
    fun getMedicalReport(@PathVariable report_id : Int) : ResponseEntity<MedicalReport>{
        return ResponseEntity<MedicalReport>(medicalReportService.getMedicalReport(report_id), HttpStatus.OK)
    }

}