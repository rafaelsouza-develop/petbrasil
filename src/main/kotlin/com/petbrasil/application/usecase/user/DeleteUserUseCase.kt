package com.petbrasil.application.usecase.user

import com.petbrasil.domain.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class DeleteUserUseCase(private val userRepository: UserRepository) {
    fun execute(id: String): Boolean {
        return if (userRepository.existsById(id)){
            userRepository.deleteById(id)
            true
        }else{
            false
        }
    }
}