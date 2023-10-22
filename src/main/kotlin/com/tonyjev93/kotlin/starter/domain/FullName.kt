package com.tonyjev93.kotlin.starter.domain

import com.fasterxml.jackson.annotation.JsonValue

data class FullName(
        @JsonValue val value: String,
) {
    companion object {
        fun of(firstName: String, lastName: String): FullName {
            return FullName("$firstName $lastName")
        }
    }
}
