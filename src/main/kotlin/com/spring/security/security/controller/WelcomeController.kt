package com.spring.security.security.controller

import com.spring.security.security.entity.AuthRequest
import com.spring.security.security.util.JWTUtil
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class WelcomeController {


    @GetMapping("/")
    fun welcome(): String {
        return "Welcome to my Application"
    }

    @PostMapping("/authenticate")
    fun generateWebToken(@RequestBody auth: AuthRequest) {
        // TODO: Make Implementation
    }
}