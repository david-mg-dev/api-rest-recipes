package com.dmproject.recipesAPI.service.user;

import com.dmproject.recipesAPI.entity.User;
import com.dmproject.recipesAPI.repository.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{


    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) { this.userRepository = userRepository; }


    @Override
    public ResponseEntity<User> create(User user) {

        userRepository.save(user);
        return ResponseEntity.ok(user);
    }

    @Override
    public List<User> findAll(User user) {

        return userRepository.findAll();
    }

    @Override
    public ResponseEntity<User> getById(Long id) {
        Optional<User> userOpt = userRepository.findById(id);

        if (userOpt.isPresent())
            return ResponseEntity.ok(userOpt.get());
        else
            return ResponseEntity.notFound().build();

    }

    @Override
    public ResponseEntity<User> update(Long id, User user) {
        Optional<User> userOpt = userRepository.findById(id);

        if (userOpt.isPresent()) {

            userOpt.get().setEmail(user.getEmail());
            userOpt.get().setName(user.getName());
            userRepository.save(userOpt.get());

            return ResponseEntity.ok(userOpt.get());
        }else {
            return ResponseEntity.notFound().build();
        }

    }

    @Override
    public ResponseEntity<User> delete(Long id) {
        Optional<User> userOpt = userRepository.findById(id);

        if (userOpt.isPresent()){
            userRepository.delete(userOpt.get());
            return ResponseEntity.ok(userOpt.get());

        }else {
            return ResponseEntity.notFound().build();
        }
    }
}
