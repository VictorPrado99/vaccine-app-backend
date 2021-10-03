package me.victo.vaccineapp.services

import me.victo.vaccineapp.models.MedicalReport

class MedicalReportService {

    fun getMedicalReport(report_id : Int) : MedicalReport{
        return MedicalReport(report_id, "Godofredo Fracos", "1231856351", 1, "Paciente deve morrer em uma semana.")
    }

}