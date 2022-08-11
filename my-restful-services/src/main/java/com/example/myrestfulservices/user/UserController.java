package com.example.myrestfulservices.user;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    private UserDaoService service;
    
    public UserController(UserDaoService service) {
        this.service = service;
    }

    @GetMapping("/users")
    public List<User> retrieveAllUsers() {
        return service.findAll();
    }

    // GET /users/1 or /users/10 등 /users 뒤에 id를 추가
    @GetMapping("/users/{id}")
    public User retrieveUser(@PathVariable int id) {
        return service.findOne(id);
    }

    @PostMapping("/users")
    public void createUser(@RequestBody User user) {
        User saveUser = service.save(user);
    }
}
