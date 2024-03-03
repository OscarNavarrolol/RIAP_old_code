package com.sena.riap.service.impl;

import com.sena.riap.entities.UserData;
import com.sena.riap.repository.UserDataRepository;
import com.sena.riap.service.UserDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDataServiceImpl implements UserDataService {

    @Autowired
    private UserDataRepository userDataRepository;

    @Override
    public List<UserData> getUserData() {
        return userDataRepository.findAll();
    }

    @Override
    public UserData saveUserData(UserData userData) {
        return null;
    }

    @Override
    public UserData getUserDataById(Long id) {
        return null;
    }

    @Override
    public UserData updateUserData(Long id, UserData userData) {
        return null;
    }

    @Override
    public void deleteUserData(Long id) {

    }
}
