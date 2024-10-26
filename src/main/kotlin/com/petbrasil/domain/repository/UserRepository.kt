package com.petbrasil.domain.repository

import com.petbrasil.domain.model.User
import org.springframework.data.mongodb.repository.MongoRepository

interface UserRepository: MongoRepository<User, String> {

    fun findByCpf(cpf: String): User?
}