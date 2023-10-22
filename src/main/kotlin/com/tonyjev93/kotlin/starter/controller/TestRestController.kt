package com.tonyjev93.kotlin.starter.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestRestController {

    @GetMapping("/test")
    fun test(): String {
        return "Hello World"
    }
}