package com.tonyjev93.kotlin.starter.service

import com.tonyjev93.kotlin.starter.domain.vo.EmailAddress
import com.tonyjev93.kotlin.starter.domain.vo.PhoneNumber
import com.tonyjev93.kotlin.starter.service.dto.PersonDto
import jakarta.validation.Valid
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull

interface PersonCreateService {
    fun create(request: CreateReq): PersonDto

    data class CreateReq(
            @field:NotBlank
            val firstName: String?,

            @field:NotBlank
            val lastName: String?,

            @field:Valid
            @field:NotNull
            val email: EmailAddress?,

            @field:Valid
            @field:NotNull
            val phone: PhoneNumber?,
    )
}

