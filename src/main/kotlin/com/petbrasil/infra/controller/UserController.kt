package com.petbrasil.infra.controller

import com.petbrasil.application.usecase.user.CreateUserUseCase
import com.petbrasil.application.usecase.user.DeleteUserUseCase
import com.petbrasil.application.usecase.user.GetUserByIdUseCase
import com.petbrasil.application.usecase.user.UpdateUserUseCase
import com.petbrasil.domain.model.User
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/users")
class UserController(
    private val createUserUseCase: CreateUserUseCase,
    private val getUserByIdUseCase: GetUserByIdUseCase,
    private val updateUserUseCase: UpdateUserUseCase,
    private val deleteUserUseCase: DeleteUserUseCase
) {

    @PostMapping
    fun createUser(@RequestBody user: User) {
        createUserUseCase.execute(user)
    }

    @GetMapping("/{id}")
    fun getUserById(@PathVariable id: String): User? {
        return getUserByIdUseCase.execute(id)
    }

    @PutMapping("/{id}")
    fun updateUser(
        @RequestBody user: User
    ): User? {
        return updateUserUseCase.execute(user)
    }

    @DeleteMapping("/{id}")
    fun deleteUser(@PathVariable id: String): Boolean {
        return deleteUserUseCase.execute(id)
    }
}