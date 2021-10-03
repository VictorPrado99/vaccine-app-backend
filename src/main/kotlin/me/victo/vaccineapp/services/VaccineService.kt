package me.victo.vaccineapp.services

import me.victo.vaccineapp.models.User
import me.victo.vaccineapp.models.UserVaccineRegistry
import me.victo.vaccineapp.models.Vaccine
import org.springframework.stereotype.Service
import java.util.*
import kotlin.math.floor

@Service
class VaccineService {

    fun retrieveTakenVaccineByUser(user : User) : List<Vaccine>{
        val takenVaccineList : MutableList<Vaccine> = mutableListOf()

        // Run some DB Process to get the vaccines the user took
        takenVaccineList.add(Vaccine(1,"Example took vaccine", 90))

        return  takenVaccineList
    }

    fun retrieveVaccinesUserShouldReceive(user : User) : List<Vaccine>{
        val shouldTakeVaccineList : MutableList<Vaccine> = mutableListOf()

        // Run some DB Process to compare what vaccines exist and what vaccine the user took, to discover what vaccine the user didn't take yet
        shouldTakeVaccineList.add(Vaccine(2,"Example should take vaccine", 180))

        return  shouldTakeVaccineList
    }

    fun whenShouldTakeThisVaccine(vaccines: List<Vaccine>, user : User) : Map<Int, Int> {
        val mapVaccineDays = mutableMapOf<Int, Int>()

        for (vaccine in vaccines){
            //Need another doses
            if(vaccine.timeBetweenDosesInDays != 0){
                //Some DB Process to get the last vaccine and this user in the registry, if exist.
                val lastTimeRegistry = UserVaccineRegistry(666, 3, 1, Date(1999, 3, 10))

                val diff: Long = Date().getTime() - lastTimeRegistry.registryDate.getTime()
                val seconds = diff / 1000
                val minutes = seconds / 60
                val hours = minutes / 60
                val days = hours / 24

                mapVaccineDays.put(vaccine.id, floor(days.toDouble()).toInt())
            }
        }

        return mapVaccineDays
    }

    fun createVaccine(vaccine: Vaccine){
        //Do some DB Stuff to register the vaccine
    }

}