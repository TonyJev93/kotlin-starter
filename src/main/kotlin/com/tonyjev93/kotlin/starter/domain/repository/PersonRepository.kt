package com.tonyjev93.kotlin.starter.domain.repository

import com.tonyjev93.kotlin.starter.domain.Person

interface PersonRepository {
    fun save(person: Person): Person
}