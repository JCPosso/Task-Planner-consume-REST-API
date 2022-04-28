package com.example.introductiontoandroid.dto.auth

import java.util.*

class TokenDto {

    private var token: String
    private var expirationDate:Date =  Date(2999, 12, 31)


    constructor(token: String, expirationDate: Date){
        this.token=token
        this.expirationDate=expirationDate

    }

    override fun toString(): String {
        return "TokenDto(expirationDate=$expirationDate, token='$token')"
    }

}