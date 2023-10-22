package com.tonyjev93.kotlin.starter.controller

import com.tonyjev93.kotlin.starter.controller.dto.TestDto
import com.tonyjev93.kotlin.starter.service.TestService
import jakarta.validation.Valid
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping(("/test"))
class TestRestController(private val testService: TestService) {

    @GetMapping
    fun test(@RequestParam value: String): String {
        return testService.test(value)
    }

    @PostMapping
    fun postTest(@Valid @RequestBody request: TestDto.Req): TestDto.Resp {
        return testService.post(request)
    }
}