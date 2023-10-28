package com.tonyjev93.kotlin.starter.infrastructure.repository

import com.tonyjev93.kotlin.starter.domain.Person
import jakarta.persistence.*

@Entity(name = "person")
class PersonEntity(
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id val id: Long = 0L,

    @Column
    val name: String = "",

    @Column
    val email: String = "",

    @Column
    val phone: String = "",
) {
    constructor(person: Person) : this(
        person.id.value,
        person.fullName.value,
        person.email.value,
        person.phone.value,
    )
}