package com.tonyjev93.kotlin.starter.service.impl

import com.tonyjev93.kotlin.starter.domain.Person
import com.tonyjev93.kotlin.starter.domain.vo.FullName
import com.tonyjev93.kotlin.starter.service.PersonCreateService
import com.tonyjev93.kotlin.starter.service.PersonCreateService.CreateReq
import com.tonyjev93.kotlin.starter.service.dto.PersonDto
import org.springframework.stereotype.Service

@Service
class PersonCreateServiceImpl : PersonCreateService {
    override fun create(request: CreateReq): PersonDto {
        val created = Person(
                FullName.of(request.firstName!!, request.lastName!!),
                request.email!!,
                request.phone!!,
        )

        return PersonDto.from(created)
    }
}