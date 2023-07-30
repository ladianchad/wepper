package com.wepping.wepper

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WepperApplication

fun main(args: Array<String>) {
    runApplication<WepperApplication>(*args)
}
