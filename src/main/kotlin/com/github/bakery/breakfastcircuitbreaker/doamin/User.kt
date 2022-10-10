package com.github.bakery.breakfastcircuitbreaker.doamin

typealias UserId = Long

data class User(
    val id: UserId,
    val name: String
)
