package com.spring.rest_api.controller;

import com.spring.rest_api.entities.User;
import com.spring.rest_api.repository.UsersRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class RestApiController {
    final Logger logger = LoggerFactory.getLogger(RestApiController.class);
    @Autowired
    private UsersRepository usersRepository;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/findAllUsers")
    public List<User> findAllUsers() {
        return (List<User>) usersRepository.findAll();
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/{id}")
    public User findUserByIp(@PathVariable Long id) {
        return usersRepository.findById(id).get();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(value = "/")
    public User createUser(@RequestBody User user) {
        logger.info("Creating user: " + user);
        usersRepository.save(user);
        logger.info("User created successfully with info: " + user);
        return user;
    }

    @ResponseStatus(HttpStatus.OK)
    @PutMapping(value = "/{id}")
    public void updateUser(@RequestBody User user, @PathVariable Long id) {
        logger.info("Updating user: " + user);
        usersRepository.save(user);
        logger.info("User updated successfully with info: " + user);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping(value = "/{id}")
    public void deleteUser(@PathVariable Long id){
        logger.info("Deleting user with id: " + id);
        User user = usersRepository.findById(id).get();
        usersRepository.delete(user);
        logger.info("User deleted successfully");
    }


}
