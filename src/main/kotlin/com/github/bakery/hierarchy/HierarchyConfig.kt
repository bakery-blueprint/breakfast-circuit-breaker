package com.github.bakery.hierarchy

import org.springframework.boot.WebApplicationType
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.context.annotation.PropertySource

@SpringBootApplication
@PropertySource("classpath:/hierarchy/application.yml")
class HierarchyContext

fun main() {
    val appBuilder: SpringApplicationBuilder = SpringApplicationBuilder()
        .parent(HierarchyContext::class.java).web(WebApplicationType.SERVLET)
    appBuilder.run()
}