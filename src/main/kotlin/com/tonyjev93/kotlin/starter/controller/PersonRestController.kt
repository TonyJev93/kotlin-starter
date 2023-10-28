package com.tonyjev93.kotlin.starter.controller

import com.tonyjev93.kotlin.starter.domain.vo.PersonId
import com.tonyjev93.kotlin.starter.service.PersonCreateService
import com.tonyjev93.kotlin.starter.service.PersonCreateService.CreateReq
import com.tonyjev93.kotlin.starter.service.PersonGetService
import com.tonyjev93.kotlin.starter.service.dto.PersonDto
import jakarta.validation.Valid
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping(("/person"))
class PersonRestController(
    private val personGetService: PersonGetService,
    private val personCreateService: PersonCreateService
) {

    @GetMapping("/{id}")
    fun getPerson(@PathVariable id: PersonId): PersonDto? {
        return personGetService.get(id)
    }

    @PostMapping
    fun create(@Valid @RequestBody request: CreateReq): PersonDto {
        return personCreateService.create(request)
    }
}