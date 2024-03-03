package com.sena.riap.service;

import com.sena.riap.entities.UserData;

import java.util.List;

public interface UserDataService {

    public List<UserData> getUserData();

    public UserData saveUserData(UserData userData);

    public UserData getUserDataById(Long id);


    public UserData updateUserData(Long id, UserData userData);

    public void deleteUserData(Long id);

}
