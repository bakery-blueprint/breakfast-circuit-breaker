package com.github.bakery.breakfastcircuitbreaker.external

import com.github.bakery.common.V1User
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@FeignClient(name = "userClient", url = "http://localhost:8081")
interface UserClient {

    @GetMapping("/api/v1/users/{userId}")
    fun findByUserId(@PathVariable userId: Long): V1User?
}
