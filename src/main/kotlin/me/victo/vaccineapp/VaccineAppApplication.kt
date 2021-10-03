package me.victo.vaccineapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class VaccineAppApplication

fun main(args: Array<String>) {
	runApplication<VaccineAppApplication>(*args)
}
