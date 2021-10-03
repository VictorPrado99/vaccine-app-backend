package me.victo.vaccineapp.services

import me.victo.vaccineapp.models.MedicalReport
import org.springframework.stereotype.Service

@Service
class MedicalReportService {

    fun getMedicalReport(report_id : Int) : MedicalReport{
        return MedicalReport(report_id, "Godofredo Fracos", "1231856351", 1, "Paciente deve morrer em uma semana.")
    }

    fun registerMedicalReport(report: MedicalReport){
        //Do stuff to register report
    }

}