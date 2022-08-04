package com.dmproject.recipesAPI.service.user;

import com.dmproject.recipesAPI.entity.User;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserService {

    ResponseEntity<User> create(User user);

    List<User> findAll(User user);

    ResponseEntity<User> getById(Long id);

    ResponseEntity<User> update(Long id, User user);

    ResponseEntity<User> delete(Long id);




}
