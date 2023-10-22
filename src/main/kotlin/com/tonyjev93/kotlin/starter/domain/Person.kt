package com.tonyjev93.kotlin.starter.domain

import com.tonyjev93.kotlin.starter.domain.vo.EmailAddress
import com.tonyjev93.kotlin.starter.domain.vo.FullName
import com.tonyjev93.kotlin.starter.domain.vo.PhoneNumber

class Person(
        val fullName: FullName,
        val email: EmailAddress,
        val phone: PhoneNumber
) {
}