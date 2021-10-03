package me.victo.vaccineapp.services

import me.victo.vaccineapp.models.MedicalUnit
import me.victo.vaccineapp.models.Medicine
import me.victo.vaccineapp.models.Vaccine
import me.victo.vaccineapp.models.utils.Location

class MedicalUnitService {

    fun getClosestMedicalUnit(location : Location) : MedicalUnit{
        //Do stuff with external google api, to find the closest location between passed location and registred location for medical unit
        //Return the one who is closest

        return MedicalUnit(
            1, "Posto da Esquina",
            listOf(Vaccine(1, "Vacina do Covid",60)),
            listOf(Medicine(1, "Metiformina")),
            Location("Rua do Sabao", 105, "08773-535", "Mogi", "São Paulo"))
    }

}