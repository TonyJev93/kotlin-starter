package com.tonyjev93.kotlin.starter.domain.vo

import com.fasterxml.jackson.annotation.JsonValue
import jakarta.validation.constraints.Pattern

data class PhoneNumber(
        @JsonValue
        @field:Pattern(regexp = """^010-\d{4}-\d{4}$""")
        val value: String
)
