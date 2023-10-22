package com.tonyjev93.kotlin.starter.service.dto

import com.tonyjev93.kotlin.starter.domain.Person
import com.tonyjev93.kotlin.starter.domain.vo.EmailAddress
import com.tonyjev93.kotlin.starter.domain.vo.FullName
import com.tonyjev93.kotlin.starter.domain.vo.PhoneNumber

data class PersonDto(
        val fullName: FullName,
        val email: EmailAddress,
        val phone: PhoneNumber,
) {
    companion object {
        fun from(request: Person): PersonDto {
            return PersonDto(
                    request.fullName,
                    request.email,
                    request.phone,
            )
        }
    }
}