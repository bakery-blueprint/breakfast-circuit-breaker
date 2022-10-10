package com.github.bakery.breakfastcircuitbreaker.doamin

import com.github.bakery.breakfastcircuitbreaker.common.log.LoggerDelegate
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker
import org.springframework.stereotype.Service

@Service
class LoadUserService(private val userQueryPort: UserQueryPort) {

    val log by LoggerDelegate()

    @CircuitBreaker(name = "loadUser", fallbackMethod = "fallback")
    fun loadUser(userId: UserId) = userQueryPort.findById(userId)

    private fun fallback(e: Throwable) : User? {
        log.error(e) { e.message }
        return null
    }
}
