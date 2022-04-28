package com.example.introductiontoandroid.dto.auth

class LoginDto {
    private var password: String
    private var email: String

    constructor(email: String, password: String) {
        this.email = email
        this.password = password
    }

    override fun toString(): String {
        return "LoginDto(password='$password', email='$email')"
    }
}