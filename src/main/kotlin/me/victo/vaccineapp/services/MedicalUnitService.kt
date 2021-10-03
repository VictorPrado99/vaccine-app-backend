package me.victo.vaccineapp.services

import me.victo.vaccineapp.models.MedicalUnit
import me.victo.vaccineapp.models.Medicine
import me.victo.vaccineapp.models.Vaccine
import me.victo.vaccineapp.models.utils.Location
import org.springframework.stereotype.Service

@Service
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

    fun getMedicalUnitWithMedicineAvailable(medicine: Medicine) : List<MedicalUnit>{
        // Do some DB Process to locate
        return listOf(MedicalUnit(1, "Sao Judas",
            listOf(Vaccine(1,"Vacina do Mal", 90)) ,
            listOf(medicine),
            Location("Rua do Pão", 882, "43202-123", "Hamburger de Noranaha", "PQP")))
    }

    fun registerMedicalUnit(medicalUnit: MedicalUnit){
        //Do stuff to register new unit
    }

}