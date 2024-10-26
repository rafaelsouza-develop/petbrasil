package com.petbrasil.application.usecase.user

import com.petbrasil.domain.model.User
import com.petbrasil.domain.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UpdateUserUseCase(private val userRepository: UserRepository) {

    fun execute(user: User): User? {
        val existingUser = userRepository.findById(user.id!!).orElse(null) ?: return null
        existingUser.cpf = user.cpf
        existingUser.email = user.email
        existingUser.fullName = user.fullName
        return userRepository.save(existingUser)
    }
}