package com.tonyjev93.kotlin.starter.domain.vo

import com.fasterxml.jackson.annotation.JsonValue
import jakarta.validation.constraints.Email

data class EmailAddress(
        @JsonValue
        @field:Email
        val value: String
)
