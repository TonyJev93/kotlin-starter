package com.tonyjev93.kotlin.starter.domain.vo

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

data class PersonId(
    @JsonValue
    val value: Long
) {
    companion object {
        @JsonCreator // 어노테이션을 정적 생성자 함수에 적용
        @JvmStatic // 어노테이션을 추가하여 정적 메서드로 사용하도록 표시
        fun from(value: String): PersonId {
            return PersonId(value.toLong())
        }
    }
}
