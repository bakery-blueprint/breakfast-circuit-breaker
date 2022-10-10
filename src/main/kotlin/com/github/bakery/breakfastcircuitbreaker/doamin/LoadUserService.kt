package com.github.bakery.breakfastcircuitbreaker.doamin

import org.springframework.stereotype.Service

@Service
class LoadUserService(private val userQueryPort: UserQueryPort) {
    fun loadUser(userId: UserId) = userQueryPort.findById(userId)
}
