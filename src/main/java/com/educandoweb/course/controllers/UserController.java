package com.educandoweb.course.controllers;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> findAll() {
        List<User> list = userService.findAll();
        return list;
    }

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id) {
        User user = userService.findById(id);
        return user;
    }

    @PostMapping
    public User insert(@RequestBody User user) {
        return userService.insert(user);
    }

    @DeleteMapping
    public void deleteById(@RequestParam(value = "id") Long id) {
        userService.deleteById(id);
    }

    @PutMapping("/{id}")
    public User update(@PathVariable Long id, @RequestBody User user) {
        return userService.update(id, user);
    }

}
