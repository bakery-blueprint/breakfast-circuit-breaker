package com.github.bakery.breakfastcircuitbreaker.external

import com.github.bakery.breakfastcircuitbreaker.doamin.User
import com.github.bakery.breakfastcircuitbreaker.doamin.UserId
import com.github.bakery.breakfastcircuitbreaker.doamin.UserQueryPort
import org.springframework.stereotype.Component

@Component
class UserExternalAdapter(private val userClient: UserClient) : UserQueryPort {
    override fun findById(userId: UserId): User? {
        return userClient.findByUserId(userId)?.let {
            User(it.id, it.name)
        }
    }
}