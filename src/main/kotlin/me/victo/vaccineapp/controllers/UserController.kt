package me.victo.vaccineapp.controllers

import me.victo.vaccineapp.models.Credential
import me.victo.vaccineapp.models.User
import me.victo.vaccineapp.services.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus.*
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*

@RequestMapping("/users")
@Controller
class UserController {

    @Autowired
    lateinit var userService : UserService

    @PostMapping("/createUser")
    fun registerNewUser(@RequestBody user : User) : ResponseEntity<User>{
        return ResponseEntity<User>(CREATED)
    }

    @PatchMapping("/changeUser")
    fun changeUser(@RequestBody user : User) : ResponseEntity<User>{
        return ResponseEntity<User>(ACCEPTED)
    }

    @GetMapping("/getUser")
    fun getUser(@RequestBody credential: Credential) : ResponseEntity<User>{
        return ResponseEntity<User>(userService.getUser(credential), OK)
    }

}