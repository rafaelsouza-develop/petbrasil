package com.petbrasil

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PetbrasilApplication

fun main(args: Array<String>) {
    runApplication<PetbrasilApplication>(*args)
}
