package com.jetherrodrigues.primer.primer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PrimerApplication

fun main(args: Array<String>) {
	runApplication<PrimerApplication>(*args)
}
