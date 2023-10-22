package com.tonyjev93.kotlin.starter.controller.dto

class TestDto {

    data class Req(
            val firstName: String,
            val lastName: String,
            val email: String,
            val phone: String,
    )

    data class Resp(
            val fullName: String,
            val email: String,
            val phone: String,
    )

}