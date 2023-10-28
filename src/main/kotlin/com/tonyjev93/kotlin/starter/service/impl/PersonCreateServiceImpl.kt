package com.tonyjev93.kotlin.starter.service.impl

import com.tonyjev93.kotlin.starter.domain.Person
import com.tonyjev93.kotlin.starter.domain.repository.PersonRepositoryPort
import com.tonyjev93.kotlin.starter.domain.vo.FullName
import com.tonyjev93.kotlin.starter.service.PersonCreateService
import com.tonyjev93.kotlin.starter.service.PersonCreateService.CreateReq
import com.tonyjev93.kotlin.starter.service.dto.PersonDto
import org.springframework.stereotype.Service

@Service
class PersonCreateServiceImpl(private val personRepositoryPort: PersonRepositoryPort) : PersonCreateService {

    override fun create(request: CreateReq): PersonDto {
        val person = Person(
            fullName = FullName.of(request.firstName!!, request.lastName!!),
            email = request.email!!,
            phone = request.phone!!,
        )

        val created = personRepositoryPort.save(person)

        return PersonDto.from(created)
    }
}