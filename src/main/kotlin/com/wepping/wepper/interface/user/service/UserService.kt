package com.wepping.wepper.`interface`.user.service

import com.wepping.wepper.`interface`.user.dto.UserDto
import com.wepping.wepper.`interface`.user.persistence.UserPersistence
import org.springframework.stereotype.Service

@Service
open abstract class UserService(
){
    lateinit var userPersistence: UserPersistence

    abstract fun getAllUsers() : List<UserDto>

    abstract fun getUserById(id: Long): UserDto
}