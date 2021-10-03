package me.victo.vaccineapp.services

import me.victo.vaccineapp.models.Credential
import me.victo.vaccineapp.models.User
import org.springframework.stereotype.Service

@Service
class UserService {

    fun getUser(credential: Credential) : User{
        return User(7, credential.userName)
    }

}