package com.github.bakery.breakfastcircuitbreaker.doamin

interface UserQueryPort {
    fun findById(userId: UserId): User?
}
