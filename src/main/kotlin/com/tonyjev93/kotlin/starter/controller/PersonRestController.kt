package com.tonyjev93.kotlin.starter.controller

import com.tonyjev93.kotlin.starter.service.PersonCreateService
import com.tonyjev93.kotlin.starter.service.PersonCreateService.CreateReq
import com.tonyjev93.kotlin.starter.service.dto.PersonDto
import jakarta.validation.Valid
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(("/person"))
class PersonRestController(private val personCreateService: PersonCreateService) {
    @PostMapping
    fun create(@Valid @RequestBody request: CreateReq): PersonDto {
        return personCreateService.create(request)
    }
}