package com.tonyjev93.kotlin.starter.infrastructure.repository

import org.springframework.data.jpa.repository.JpaRepository

interface PersonRepositoryJpa : JpaRepository<PersonEntity, Long> {
}