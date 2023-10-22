package com.tonyjev93.kotlin.starter.service.impl

import com.tonyjev93.kotlin.starter.domain.Person
import com.tonyjev93.kotlin.starter.domain.repository.PersonRepository
import com.tonyjev93.kotlin.starter.domain.vo.FullName
import com.tonyjev93.kotlin.starter.service.PersonCreateService
import com.tonyjev93.kotlin.starter.service.PersonCreateService.CreateReq
import com.tonyjev93.kotlin.starter.service.dto.PersonDto
import org.springframework.stereotype.Service

@Service
class PersonCreateServiceImpl(private val personRepository: PersonRepository) : PersonCreateService {

    override fun create(request: CreateReq): PersonDto {
        val person = Person(
                FullName.of(request.firstName!!, request.lastName!!),
                request.email!!,
                request.phone!!,
        )

        val created = personRepository.save(person)

        return PersonDto.from(created)
    }
}