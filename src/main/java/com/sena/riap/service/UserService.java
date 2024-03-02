package com.sena.riap.service;

import com.sena.riap.entities.UserData;

import java.util.List;

public interface UserService {

    public List<UserData> getUsers();

    public UserData saveUser(UserData userData);

    public UserData getUserById(Long id);


    public UserData updateUser(Long id, UserData userData);

    public void deleteUser(Long id);

}
