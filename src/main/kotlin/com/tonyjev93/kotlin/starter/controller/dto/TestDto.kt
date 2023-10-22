package com.tonyjev93.kotlin.starter.controller.dto

import com.tonyjev93.kotlin.starter.domain.EmailAddress
import com.tonyjev93.kotlin.starter.domain.FullName
import com.tonyjev93.kotlin.starter.domain.PhoneNumber
import jakarta.validation.Valid
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull

class TestDto {

    data class Req(
            @field:NotBlank
            val firstName: String,

            @field:NotBlank
            val lastName: String,

            @field:Valid
            @field:NotNull
            val email: EmailAddress?,

            @field:Valid
            @field:NotNull
            val phone: PhoneNumber?,
    )

    data class Resp(
            val fullName: FullName,
            val email: EmailAddress?,
            val phone: PhoneNumber?,
    )

}