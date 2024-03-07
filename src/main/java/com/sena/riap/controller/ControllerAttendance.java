package com.sena.riap.controller;

import com.sena.riap.entities.Attendance;
import com.sena.riap.entities.UserData;
import com.sena.riap.service.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/attendance")
public class ControllerAttendance {

    @Autowired
    private AttendanceService attendanceService;

    @GetMapping("/listAttendance")
    public String listAttendances (Model model) {
        List<Attendance> attendanceData = attendanceService.getAttendance();
        model.addAttribute("attendance", attendanceData);
        return "admin/principal/list_users";
    }

}
