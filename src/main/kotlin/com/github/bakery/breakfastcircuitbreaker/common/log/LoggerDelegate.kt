package com.github.bakery.breakfastcircuitbreaker.common.log

import mu.KLogger
import mu.KotlinLogging
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

class LoggerDelegate : ReadOnlyProperty<Any, KLogger> {
    override operator fun getValue(thisRef: Any, property: KProperty<*>): KLogger {
        return KotlinLogging.logger(thisRef.javaClass.name)
    }
}
