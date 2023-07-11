package com.educandoweb.course.controllers;

import com.educandoweb.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @GetMapping
public User findAll() {
    User user = new User(1L, "Maria", "maria@gmail.com", "999999999", "1234567");
    return user;
}


}
