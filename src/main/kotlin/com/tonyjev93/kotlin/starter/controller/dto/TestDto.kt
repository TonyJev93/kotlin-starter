package com.tonyjev93.kotlin.starter.controller.dto

import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotEmpty
import jakarta.validation.constraints.Pattern

class TestDto {

    data class Req(
            @field:NotBlank
            val firstName: String?,

            @field:NotEmpty
            val lastName: String,

            @field:Email
            val email: String,

            @field:Pattern(regexp = """^010-\d{4}-\d{4}$""")
            val phone: String,
    )

    data class Resp(
            val fullName: String,
            val email: String,
            val phone: String,
    )

}