package com.sena.riap.controller;


import com.sena.riap.entities.EventData;
import com.sena.riap.entities.Program;
import com.sena.riap.service.ProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/program")
public class ControllerProgram {

    @Autowired
    private ProgramService programService;

    @GetMapping("/listProgram")
    public String listPrograms (Model model) {
        List<Program> programData = programService.getProgram();
        model.addAttribute("program", programData);
        return "admin/principal/list_users";
    }

}
