package com.petbrasil.application.usecase.user

import com.petbrasil.domain.model.User
import com.petbrasil.domain.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class CreateUserUseCase(private val repository: UserRepository) {
    fun execute(user: User): User {

        require(user.cpf.isNotEmpty()){"CPF needs to be set"}
        require(user.fullName.isNotEmpty()) { "Full name needs to be set" }
        require(user.email.isNotEmpty() && user.email.contains("@") ) { "Email needs to be set" }
        return repository.save(user)
    }
}