package com.sena.riap.controller;


import com.sena.riap.entities.UserData;
import com.sena.riap.service.UserDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping({"/","/userData"})
public class ControllerUserData {

    @Autowired
    private UserDataService userDataService;

    @GetMapping("/tables")
    public String tablesGeneral() {
        return "admin/principal/list_users";
    }

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


    // VAINAS MIA No TOCAR
    @GetMapping("/newUserData")
    public String createNewUser(Model model){
        model.addAttribute("userData",new UserData());
        model.addAttribute("action","");
        return "admin/principal/formNewUser";
    }

    @PostMapping("/newUserData")
    public String saveUserData (@ModelAttribute UserData userData){
        userDataService.saveUserData(userData);
        return "redirect:/tables";
    }

    @GetMapping("/editUser/{idUser}")
    public String updateUserData (@PathVariable Long idUser, Model model){
        model.addAttribute("userData",userDataService.getUserDataById(idUser)); // userData
        model.addAttribute("action","/editUser/" + idUser);
        return "admin/principal/formNewUser";
    }

    @PostMapping("/editUser/{idUser}")
    public String updatingUserData (@PathVariable Long idUser,@ModelAttribute UserData userData){
        userDataService.updateUserData(idUser, userData);
        return "redirect:/tables";
    }

    @GetMapping("/delete/{idUser}")
    public String deleteUserData (@PathVariable Long idUser){
        userDataService.deleteUserData(idUser);
        return "redirect:/tables";
    }

}
