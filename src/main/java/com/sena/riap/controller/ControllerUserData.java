package com.sena.riap.controller;


import com.sena.riap.entities.UserData;
import com.sena.riap.service.UserDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping({"/","/userData"})
public class ControllerUserData {

    @Autowired
    private UserDataService userDataService;

    @GetMapping("/users")
    public String listarUsers(Model model) {
        List<UserData> usersData = userDataService.getUserData();
        model.addAttribute("users", usersData);
        return "admin/principal/list_users";
    }

    @GetMapping("/aboutUs")
    public String getAboutUsPage(){
        return "general/aboutUs";
    }

    @GetMapping("/login")
    public String getLoginPage(){
        return "general/login";
    }

    @GetMapping
    public String getHomePage(){
        return "general/homePage";
    }


}
