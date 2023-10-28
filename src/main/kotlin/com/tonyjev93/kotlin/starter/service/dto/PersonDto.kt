package com.tonyjev93.kotlin.starter.service.dto

import com.tonyjev93.kotlin.starter.domain.Person
import com.tonyjev93.kotlin.starter.domain.vo.EmailAddress
import com.tonyjev93.kotlin.starter.domain.vo.FullName
import com.tonyjev93.kotlin.starter.domain.vo.PersonId
import com.tonyjev93.kotlin.starter.domain.vo.PhoneNumber

data class PersonDto(
    val id: PersonId,
    val fullName: FullName,
    val email: EmailAddress,
    val phone: PhoneNumber,
) {
    companion object {
        fun from(person: Person): PersonDto {
            return PersonDto(
                person.id,
                person.fullName,
                person.email,
                person.phone,
            )
        }
    }
}