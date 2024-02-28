package com.sena.riap.service;

import com.sena.riap.entities.Record;
import com.sena.riap.entities.User;

import java.util.List;

public interface UserService {

    public List<User> getUsers();

    public User saveUser(User user);

    public User getUserById(Long id);


    public User updateUser(Long id,User user);

    public void deleteUser(Long id);

}
