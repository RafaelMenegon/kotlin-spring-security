package com.spring.security.security

import com.spring.security.security.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SecurityApplication


@Autowired
lateinit var userRepository: UserRepository

fun main(args: Array<String>) {
    runApplication<SecurityApplication>(*args)
}


