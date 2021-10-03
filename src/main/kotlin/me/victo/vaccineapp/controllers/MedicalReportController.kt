package me.victo.vaccineapp.controllers

import me.victo.vaccineapp.models.MedicalReport
import me.victo.vaccineapp.services.MedicalReportService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*

@Controller
@RequestMapping("/reports")
class MedicalReportController {

    @Autowired
    lateinit var medicalReportService : MedicalReportService

    @GetMapping("/getReport/{report_id}")
    fun getMedicalReport(@PathVariable report_id : Int) : ResponseEntity<MedicalReport>{
        return ResponseEntity<MedicalReport>(medicalReportService.getMedicalReport(report_id), HttpStatus.OK)
    }

    @PostMapping("/registerMedicalReport")
    fun registerMedicalReport(@RequestBody medicalReport: MedicalReport) : ResponseEntity<MedicalReport> {
        medicalReportService.registerMedicalReport(medicalReport)
        return ResponseEntity<MedicalReport>(HttpStatus.CREATED)
    }

}