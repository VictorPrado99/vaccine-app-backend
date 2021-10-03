package me.victo.vaccineapp.services

import me.victo.vaccineapp.models.Medicine

class MedicineService {

    fun getMedicine(medicine_id : Int) : Medicine{
        return Medicine(medicine_id, "Paracetamol")
    }

}