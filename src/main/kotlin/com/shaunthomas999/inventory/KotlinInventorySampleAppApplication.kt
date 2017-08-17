package com.shaunthomas999.inventory

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class KotlinInventorySampleAppApplication

fun main(args: Array<String>) {
    SpringApplication.run(KotlinInventorySampleAppApplication::class.java, *args)
}
