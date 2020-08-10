package com.spring.security.security.service

import com.spring.security.security.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.core.userdetails.User
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.stereotype.Service
import javax.xml.bind.ValidationException

@Service
class CustomUserDetailsService : UserDetailsService {

    @Autowired
    private lateinit var userRepository: UserRepository


    override fun loadUserByUsername(username: String?): UserDetails? {
        userRepository.save(com.spring.security.security.entity.User(1, "rafa", "123", "rafa@gmail.com"))
        val user = username?.let { userRepository.findByUserName(it) }
        return if (user != null) {
            User(user.userName, user.password, listOf())
        } else {
            throw ValidationException("Username not found")
        }
    }
}