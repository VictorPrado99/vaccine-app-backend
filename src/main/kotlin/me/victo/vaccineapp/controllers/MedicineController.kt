package me.victo.vaccineapp.controllers

import me.victo.vaccineapp.models.MedicalUnit
import me.victo.vaccineapp.models.Medicine
import me.victo.vaccineapp.services.MedicineService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*

@RequestMapping("/medicines")
@Controller
class MedicineController {

    @Autowired
    lateinit var medicineService: MedicineService

    @PostMapping("/createMedicine")
    fun registerNewMedicine(@RequestBody medicine: Medicine) : ResponseEntity<Medicine> {
        return ResponseEntity<Medicine>(HttpStatus.CREATED)
    }

    @PatchMapping("/changeMedicine")
    fun changeUser(@RequestBody medicine : Medicine) : ResponseEntity<Medicine> {
        return ResponseEntity<Medicine>(HttpStatus.ACCEPTED)
    }

    @GetMapping("/getMedicine/{medicine_id}")
    fun getMedicine(@PathVariable medicine_id : Int) : ResponseEntity<Medicine>{
        return ResponseEntity<Medicine>(medicineService.getMedicine(medicine_id), HttpStatus.OK)
    }

    @GetMapping("/getMedicine")
    fun queryMedicines(
        @RequestParam("medicineName") medicineName : String
        ) : ResponseEntity<List<Medicine>> {
       return ResponseEntity<List<Medicine>>(medicineService.queryMedicine(medicineName), HttpStatus.OK)
    }

    @PostMapping("/registerAvailableMedineAt/{medical_unit_id}")
    fun registerAvailableMedicine(
        @PathVariable(name = "medical_unit_id") medicalUnitId : Int,
        @RequestBody medicines: List<Medicine>
    ): ResponseEntity<Unit> {
        medicineService.updateMedicineStockAt(medicalUnitId, medicines)
        return ResponseEntity(HttpStatus.ACCEPTED)
    }

}