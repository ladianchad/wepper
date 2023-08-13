package com.wepping.wepper.domain.user

import com.wepping.wepper.`interface`.user.dto.UserDto
import com.wepping.wepper.`interface`.user.service.UserService
import org.springframework.stereotype.Component


@Component
class UserServiceImpl(

) : UserService(

) {
    override fun getAllUsers(): List<UserDto> {
        return this.userPersistence.getAll().map {
            user -> user.toDto()
        }
    }

    override fun getUserById(id: Long): UserDto {
        return this.userPersistence.getById(id).toDto()
    }
}