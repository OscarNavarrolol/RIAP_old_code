package com.sena.riap.controller;

import com.sena.riap.entities.UserData;
import com.sena.riap.service.UserDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping({"/","/userData"})
public class ControllerUserData {

    @Autowired
    private UserDataService userDataService;

    @GetMapping("/tables")
    public String tablesGeneral() {
        return "admin/principal/ListUsers";
    }

    @GetMapping("/users")
    public String listUsers(Model model) {
        List<UserData> usersData = userDataService.getUserData();
        model.addAttribute("users", usersData);
        return "admin/principal/ListUsers";
    }

    @GetMapping("/aboutUs")
    public String getAboutUsPage(){
        return "general/AboutUs";
    }

    @GetMapping("/resetPassword")
    public String getResetPasswordPage(){
        return "general/PasswordReset";
    }

    @GetMapping("/login")
    public String getLoginPage(){
        return "general/Login";
    }

    @GetMapping
    public String getHomePage(){
        return "general/HomePage";
    }


    // VAINAS MIA No TOCAR
    @GetMapping("/newUserData")
    public String createNewUser(Model model){
        model.addAttribute("userData",new UserData());
        model.addAttribute("action","");
        return "admin/principal/FormNewUser";
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
        return "admin/principal/FormNewUser";
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

    // @Secured("ROLE_ADMIN")  VAINAS PAL FUTURE
    @GetMapping("/principal")
    public String showPrincipalPage(Model model) {
        UserData userStarted = userDataService.getLoggedInUser();
        model.addAttribute("users", userStarted );
        return "admin/principal/PrincipalAdmin";
    }

    @PostMapping("/auth")
    public String verifyCredentials(@RequestParam("document") String document, @RequestParam("password") String password, RedirectAttributes redirectAttributes) {
        UserData user = userDataService.loginUser(document, password);

        if (user != null) {
            redirectAttributes.addFlashAttribute("users", user);
            return "redirect:/principal";
        } else {
            redirectAttributes.addFlashAttribute("errorMessage", "Incorrect credentials");
        }
        return "redirect:/login";
    }

    @GetMapping("/logout")
    public String logout() {
        return "redirect:/login";
    }

}
