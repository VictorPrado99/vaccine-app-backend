package me.victo.vaccineapp.services

import me.victo.vaccineapp.models.Medicine
import org.springframework.stereotype.Service

@Service
class MedicineService {

    fun getMedicine(medicine_id : Int) : Medicine{
        return Medicine(medicine_id, "Paracetamol")
    }

    fun queryMedicine(medicineName : String) : List<Medicine>{
        if(medicineName.isNotBlank() && medicineName.isNotEmpty() && medicineName != null){}
            //Some DB Process to query the medicine
        return listOf(Medicine(1, medicineName))
    }

    fun updateMedicineStockAt(medicalUnitId : Int, medicines: List<Medicine>){
        for (medicine in medicines){
            //Save in DB using medicalUnitId
        }
    }

}