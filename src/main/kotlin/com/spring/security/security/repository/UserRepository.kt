package com.spring.security.security.repository

import com.spring.security.security.entity.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : JpaRepository<User, Long> {


    fun findByUserName(username: String): User

}