package com.github.bakery.hierarchy

import java.util.*
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/users")
class UserController {

    @GetMapping("/{id}")
    fun getUser(@PathVariable id: Long): V1User {
        return V1User(id, UUID.randomUUID().toString())
    }
}
