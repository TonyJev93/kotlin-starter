package com.tonyjev93.kotlin.starter

import io.github.oshai.kotlinlogging.KotlinLogging
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinStarterApplication


val logger = KotlinLogging.logger {}

fun main(args: Array<String>) {
    runApplication<KotlinStarterApplication>(*args)
}
