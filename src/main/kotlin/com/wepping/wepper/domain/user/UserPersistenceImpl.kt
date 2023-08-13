package com.wepping.wepper.domain.user

import com.wepping.wepper.`interface`.user.persistence.UserPersistence
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Component

@Component
class UserPersistenceImpl(

) : UserPersistence() {

    override fun getAll(): List<User> {
        return this.repository.findAll().toList()
    }

    override fun getById(id: Long): User {
        return this.repository.findByIdOrNull(id) ?: throw error("")
    }
}