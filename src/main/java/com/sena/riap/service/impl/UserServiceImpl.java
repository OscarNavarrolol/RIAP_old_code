package com.sena.riap.service.impl;

import com.sena.riap.entities.UserData;
import com.sena.riap.repository.UserRepository;
import com.sena.riap.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserData> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public UserData saveUser(UserData userData) {
        return null;
    }

    @Override
    public UserData getUserById(Long id) {
        return null;
    }

    @Override
    public UserData updateUser(Long id, UserData userData) {
        return null;
    }

    @Override
    public void deleteUser(Long id) {

    }
}
