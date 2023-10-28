package com.tonyjev93.kotlin.starter.domain.repository

import com.tonyjev93.kotlin.starter.domain.Person
import com.tonyjev93.kotlin.starter.domain.vo.PersonId

interface PersonRepositoryPort {
    fun get(personId: PersonId): Person
    fun save(person: Person): Person
}