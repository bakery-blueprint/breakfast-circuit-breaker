package com.github.bakery.hierarchy

import com.github.bakery.common.V1User
import java.util.*
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/users")
class UserController {

    @GetMapping("/{id}")
    fun getUser(@PathVariable id: Long): ResponseEntity<V1User> {
        if (Random().nextBoolean()) {
            return ResponseEntity.notFound().build()
        }

        return ResponseEntity.ok(V1User(id, UUID.randomUUID().toString()))
    }
}
