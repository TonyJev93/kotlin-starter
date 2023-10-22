package com.tonyjev93.kotlin.starter.service

import com.tonyjev93.kotlin.starter.controller.dto.TestDto

interface TestService {
    fun test(value: String): String
    fun post(request: TestDto.Req): TestDto.Resp
}