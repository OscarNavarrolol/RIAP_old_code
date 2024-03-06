package com.sena.riap.controller;

import com.sena.riap.entities.*;
import com.sena.riap.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api")
@RestController()
public class ControllerApi {

    @Autowired
    private UserDataService userDataService;

    @Autowired
    private UserCourseService userCourseService;

    @Autowired
    private ProgramService programService;

    @Autowired
    private EventDataService eventDataService;

    @Autowired
    private CourseService courseService;

    @Autowired
    private AttendanceService attendanceService;

    @GetMapping("/users")
    public List<UserData> listUsers(){
        return userDataService.getUserData();
    }

    @GetMapping("/userCourse")
    public List<UserCourse> listUserCourse(){
        return userCourseService.getUserCourse();
    }

    @GetMapping("/program")
    public List<Program> listProgram(){
        return programService.getProgram();
    }

    @GetMapping("/eventData")
    public List<EventData> listEventData(){
        return eventDataService.getEventData();
    }

    @GetMapping("/course")
    public List<Course> listCourse(){
        return courseService.getCourse();
    }

    @GetMapping("/attendance")
    public List<Attendance> listAttendance(){
        return attendanceService.getAttendance();
    }
}
