package com.sena.riap.controller;


import com.sena.riap.entities.Program;
import com.sena.riap.entities.UserCourse;
import com.sena.riap.service.UserCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/userCourse")
public class ControllerUserCourse {

    @Autowired
    private UserCourseService userCourseService;

    @GetMapping("/listUserCourse")
    public String listUsersCourses (Model model) {
        List<UserCourse> userCourseData = userCourseService.getUserCourse();
        model.addAttribute("userCourse", userCourseData);
        return "admin/principal/list_users";
    }

}
