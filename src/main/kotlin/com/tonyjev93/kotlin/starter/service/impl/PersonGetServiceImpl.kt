package com.tonyjev93.kotlin.starter.service.impl

import com.tonyjev93.kotlin.starter.domain.vo.PersonId
import com.tonyjev93.kotlin.starter.service.PersonGetService
import com.tonyjev93.kotlin.starter.service.dto.PersonDto
import org.springframework.stereotype.Service

@Service
class PersonGetServiceImpl() : PersonGetService {

    override fun get(personId: PersonId): PersonDto? {
        return null
    }
}