package com.tonyjev93.kotlin.starter.service

import com.tonyjev93.kotlin.starter.domain.vo.PersonId
import com.tonyjev93.kotlin.starter.service.dto.PersonDto

interface PersonGetService {
    fun get(personId: PersonId): PersonDto?
}

