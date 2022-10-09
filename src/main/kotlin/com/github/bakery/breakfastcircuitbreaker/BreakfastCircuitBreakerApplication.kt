package com.github.bakery.breakfastcircuitbreaker

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BreakfastCircuitBreakerApplication

fun main(args: Array<String>) {
    runApplication<BreakfastCircuitBreakerApplication>(*args)
}
