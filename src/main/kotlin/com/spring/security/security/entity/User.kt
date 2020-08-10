package com.spring.security.security.entity

import javax.persistence.*

@Entity
@Table(name = "USER_TBL")
data class User(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long,
        val userName: String,
        val password: String,
        val email: String
) {
        override fun toString(): String {
                return "User(id=$id, userName='$userName', password='$password', email='$email')"
        }
}