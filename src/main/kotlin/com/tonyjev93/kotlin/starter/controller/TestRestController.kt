package com.tonyjev93.kotlin.starter.controller

import com.tonyjev93.kotlin.starter.controller.dto.TestDto
import com.tonyjev93.kotlin.starter.service.TestService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(("/test"))
class TestRestController(private val testService: TestService) {

    @GetMapping
    fun test(@RequestParam value: String): String {
        return testService.test(value)
    }

    @PostMapping
    fun postTest(@RequestBody request: TestDto.Req): TestDto.Resp {
        return testService.post(request)
    }
}