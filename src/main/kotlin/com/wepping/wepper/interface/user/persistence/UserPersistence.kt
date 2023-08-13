package com.wepping.wepper.`interface`.user.persistence

import com.wepping.wepper.Persistence
import com.wepping.wepper.domain.user.User

open abstract class UserPersistence() : Persistence<User>() {

    abstract fun getAll() : List<User>

    abstract fun getById(id: Long) : User
}