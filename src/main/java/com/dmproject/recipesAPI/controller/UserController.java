package com.dmproject.recipesAPI.controller;

import com.dmproject.recipesAPI.entity.User;
import com.dmproject.recipesAPI.service.user.UserServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    private final UserServiceImpl userService;


    public UserController(UserServiceImpl userService) { this.userService = userService; }


    /**
     * Endpoint create user
     * http://localhost/api/user
     * @param user
     * @return
     */
    @PostMapping("/api/user")
    public ResponseEntity<User> create(@RequestBody User user){

        return userService.create(user);
    }


    /**
     * Endpoint List all users
     * http://localhost/api/user
     * @param user
     * @return
     */
    @GetMapping("/api/user")
    public List<User> findAll(User user){

        return userService.findAll(user);
    }


    /**
     * Endpoint List user by id
     * http://localhost/api/user
     * @param id
     * @return
     */
    @GetMapping("/api/user/{id}")
    public ResponseEntity<User> getById(@PathVariable Long id){

        return userService.getById(id);
    }


    /**
     * Endpoint Update user by id
     * http://localhost/api/user
     * @param id
     * @param user
     * @return
     */
    @PutMapping("/api/user/{id}")
    public ResponseEntity<User> update(@PathVariable Long id, @RequestBody User user){

        return userService.update(id, user);
    }


    /**
     * Endpoint Delete user by id
     * http://localhost/api/user
     * @param id
     * @return
     */
    @DeleteMapping("/api/user/{id}")
    public ResponseEntity<User> delete(@PathVariable Long id){

        return userService.delete(id);
    }
}
