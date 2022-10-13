package com.github.bakery.breakfastcircuitbreaker.controller

import org.junit.jupiter.api.Test
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.TestConstructor
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.get

@SpringBootTest
@AutoConfigureMockMvc
@TestConstructor(autowireMode = TestConstructor.AutowireMode.ALL)
class CircuitBreakerEndpointTest(private val mockMvc: MockMvc) {

    @Test
    fun get() {
        mockMvc.get("/actuator/circuitbreakers")
            .andDo { print() }
            .andExpect { status { isOk() } }
    }
}