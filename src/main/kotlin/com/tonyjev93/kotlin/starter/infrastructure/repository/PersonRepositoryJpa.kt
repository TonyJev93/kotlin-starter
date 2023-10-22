package com.tonyjev93.kotlin.starter.infrastructure.repository

import com.tonyjev93.kotlin.starter.domain.Person
import com.tonyjev93.kotlin.starter.domain.repository.PersonRepository
import com.tonyjev93.kotlin.starter.logger
import org.springframework.stereotype.Component

@Component
class PersonRepositoryJpa : PersonRepository {
    override fun save(person: Person): Person {

        logger.info { "${person.fullName.value} created" }

        return person
    }
}