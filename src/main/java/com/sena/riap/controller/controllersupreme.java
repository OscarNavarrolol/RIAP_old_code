package com.sena.riap.controller;

import com.sena.riap.entities.UserData;
import com.sena.riap.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@Controller
@RequestMapping({"/","/homepage"})
public class controllersupreme {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public String listarUsuarios(Model model) {
        List<UserData> userData = userService.getUsers();
        model.addAttribute("usuarios", userData);
        return "admin/principal/list_users";
    }

    @GetMapping("/aboutUs")
    public String getAboutUsPage(){
        return "admin/principal/about_us";
    }
/*
    @GetMapping("/aboutUs")
    public String getLoginPage(){
        return "admin/principal/about_us";
    }

 */
    @GetMapping
    public String getHomePage(){
        return "admin/principal/homepage";
    }

}
