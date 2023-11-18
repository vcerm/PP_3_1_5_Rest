package ru.kata.spring.boot_security.demo.rest_controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.kata.spring.boot_security.demo.entity.User;
import ru.kata.spring.boot_security.demo.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/api/admin/users")
public class RestAdminController {
    private final UserService userService;

    @Autowired
    public RestAdminController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping()
    public ResponseEntity<List<User>> showAllUser(){
        List<User> users = userService.allUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<User> showUserById(@PathVariable Long id){
        User user = userService.findUserById(id);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }


    @PostMapping()
    public ResponseEntity<User> saveUser(@RequestBody User user){
        userService.saveUser(user);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @PutMapping()
    public ResponseEntity<User> updateUser(@RequestBody User user){
        userService.update(user);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id){
        userService.deleteById(id);
    }


}