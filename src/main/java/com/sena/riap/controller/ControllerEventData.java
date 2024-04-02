package com.sena.riap.controller;

import com.sena.riap.entities.EventData;

import com.sena.riap.entities.UserData;
import com.sena.riap.service.CourseService;
import com.sena.riap.service.EventDataService;
import com.sena.riap.service.UserDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/eventData")
public class ControllerEventData {

    @Autowired
    private EventDataService eventDataService;

    @Autowired
    private CourseService courseService;

    @Autowired
    private UserDataService userDataService;

    @GetMapping("/listEvent")
    public String listEvents (Model model) {
        List<EventData> eventData = eventDataService.getEventData();
        model.addAttribute("events", eventData);
        return "admin/principal/EventList";
    }

    @GetMapping("/createEvent")
    public String createNewEvent(Model model){
        model.addAttribute("eventData",new EventData());
        model.addAttribute("action","");
        return "admin/principal/CreateEvent";
    }

    @PostMapping("/createEvent")
    public String createNewEvent(@ModelAttribute EventData eventData){
        eventDataService.saveEventData(eventData);
        return "redirect:/userData/principal";
    }

    @ModelAttribute("courseNumbers")
    public List<Integer> allCourseNumbers() {
        UserData user = userDataService.getLoggedInUser();
        Long idUser = user.getIdUser();
        return courseService.getCoursesByUser(idUser);
    }

}
