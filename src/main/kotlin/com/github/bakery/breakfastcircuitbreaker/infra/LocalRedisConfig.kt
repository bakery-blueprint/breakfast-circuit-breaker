package com.github.bakery.breakfastcircuitbreaker.infra

import com.github.bakery.breakfastcircuitbreaker.common.log.LoggerDelegate
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Configuration
import redis.embedded.RedisServer
import javax.annotation.PostConstruct
import javax.annotation.PreDestroy

@Configuration
class LocalRedisConfig(@Value("\${spring.redis.port}") private val port: Int) {

    private lateinit var redisServer: RedisServer

    private val log by LoggerDelegate()

    @PostConstruct
    fun init() {
        redisServer = RedisServer(port)
        redisServer.start()
        log.info { "Started embedded-redis on port : $port" }
    }

    @PreDestroy
    fun destroy() {
        redisServer.stop()
    }

}