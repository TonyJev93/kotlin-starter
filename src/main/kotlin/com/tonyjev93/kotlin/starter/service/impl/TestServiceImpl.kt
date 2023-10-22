package com.tonyjev93.kotlin.starter.service.impl

import com.tonyjev93.kotlin.starter.service.TestService
import org.springframework.stereotype.Service

@Service
class TestServiceImpl : TestService {
    override fun test(value: String): String {
        return "Hello, $value."
    }
}