package com.sena.riap.controller;

import com.sena.riap.entities.User;
import com.sena.riap.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@Controller
@RequestMapping({"/","/inicio"})
public class controllersupreme {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public String listarUsuarios(Model model) {
        List<User> users = userRepository.findAll();
        model.addAttribute("usuarios", users);
        return "admin/principal/lista-usuarios";
    }

}
