package com.tonyjev93.kotlin.starter.infrastructure.repository

import com.tonyjev93.kotlin.starter.domain.Person
import com.tonyjev93.kotlin.starter.domain.repository.PersonRepositoryPort
import com.tonyjev93.kotlin.starter.domain.vo.EmailAddress
import com.tonyjev93.kotlin.starter.domain.vo.FullName
import com.tonyjev93.kotlin.starter.domain.vo.PersonId
import com.tonyjev93.kotlin.starter.domain.vo.PhoneNumber
import com.tonyjev93.kotlin.starter.logger
import org.springframework.stereotype.Component

@Component
class PersonRepository(private val repository: PersonRepositoryJpa) : PersonRepositoryPort {
    override fun get(personId: PersonId): Person {
        val person = repository.findById(personId.value).orElse(null)

        return Person(
            PersonId(person.id),
            FullName(person.name),
            EmailAddress(person.email),
            PhoneNumber(person.phone)
        )
    }

    override fun save(person: Person): Person {
        logger.info { "${person.fullName.value} created" }

        val save = repository.save(
            PersonEntity(person)
        )

        return Person(
            id = PersonId(save.id),
            fullName = FullName(save.name),
            email = EmailAddress(save.email),
            phone = PhoneNumber(save.phone)
        )
    }
}