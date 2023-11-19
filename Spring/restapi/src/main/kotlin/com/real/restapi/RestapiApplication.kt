package com.real.restapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
class RestapiApplication {
    @GetMapping("/")
    fun hello(): String {
        return "Hello World"
    }
}

fun main(args: Array<String>) {
    runApplication<RestapiApplication>(*args)
}
