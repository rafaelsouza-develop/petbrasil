package com.petbrasil.domain.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class User(
    @Id var id: String? = null,
    var fullName: String,
    var password: String,
    var email: String,
    var cpf: String,
)
