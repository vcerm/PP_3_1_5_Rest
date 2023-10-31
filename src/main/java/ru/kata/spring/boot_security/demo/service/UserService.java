package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.entity.User;

import java.util.List;

public interface UserService {
    public User findUserById(Long userId);

    public List<User> allUsers();

    public boolean saveUser(User user);

    public void deleteById(Long id);

    public User findByUsername(String username);

}
