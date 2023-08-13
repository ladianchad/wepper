package com.wepping.wepper

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PersistenceRepository<EntityType> : JpaRepository<EntityType, Long>

open class Persistence<EntityType>(
) {
    lateinit var repository: PersistenceRepository<EntityType>
}