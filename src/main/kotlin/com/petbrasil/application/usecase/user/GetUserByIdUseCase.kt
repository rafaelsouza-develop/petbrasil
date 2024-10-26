package com.petbrasil.application.usecase.user

import com.petbrasil.domain.model.User
import com.petbrasil.domain.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class GetUserByIdUseCase(val userRepository: UserRepository) {

    fun execute(userId: String): User? {
        return userRepository.findById(userId).orElse(null)
    }

}