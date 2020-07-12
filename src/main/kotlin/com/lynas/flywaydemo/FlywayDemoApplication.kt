package com.lynas.flywaydemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.flyway.FlywayMigrationStrategy
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean


@SpringBootApplication
class FlywayDemoApplication {
    @Bean
    fun flywayMigrationStrategy(): FlywayMigrationStrategy? {
        return FlywayMigrationStrategy { }
    }
}

fun main(args: Array<String>) {
    runApplication<FlywayDemoApplication>(*args)
}
