package com.tonyjev93.kotlin.starter.controller

import com.tonyjev93.kotlin.starter.service.TestService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class TestRestController(private val testService: TestService) {

    @GetMapping("/test")
    fun test(@RequestParam value: String): String {
        return testService.test(value)
    }
}