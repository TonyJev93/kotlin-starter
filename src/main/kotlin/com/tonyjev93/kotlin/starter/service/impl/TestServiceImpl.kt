package com.tonyjev93.kotlin.starter.service.impl

import com.tonyjev93.kotlin.starter.controller.dto.TestDto
import com.tonyjev93.kotlin.starter.domain.FullName
import com.tonyjev93.kotlin.starter.service.TestService
import org.springframework.stereotype.Service

@Service
class TestServiceImpl : TestService {
    override fun test(value: String): String {
        return "Hello, $value."
    }

    override fun post(request: TestDto.Req): TestDto.Resp {
        return TestDto.Resp(
                FullName.of(request.firstName, request.lastName),
                request.email,
                request.phone,
        )
    }
}