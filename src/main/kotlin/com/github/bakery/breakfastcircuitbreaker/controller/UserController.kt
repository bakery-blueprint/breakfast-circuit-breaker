package com.github.bakery.breakfastcircuitbreaker.controller

import com.github.bakery.breakfastcircuitbreaker.doamin.LoadUserService
import com.github.bakery.common.V1User
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/users")
class UserController(private val loadUserService: LoadUserService) {

    @GetMapping("/{id}")
    fun getUser(@PathVariable id: Long): V1User {
        return loadUserService.loadUser(id).let {
            V1User(it.id, it.name)
        }
    }
}
