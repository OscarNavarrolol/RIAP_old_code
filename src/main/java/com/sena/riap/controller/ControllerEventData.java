package com.sena.riap.controller;

import com.sena.riap.entities.Course;
import com.sena.riap.entities.EventData;
import com.sena.riap.service.EventDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/eventData")
public class ControllerEventData {

    @Autowired
    private EventDataService eventDataService;

    @GetMapping("/listEvent")
    public String listEvents (Model model) {
        List<EventData> eventData = eventDataService.getEventData();
        model.addAttribute("event", eventData);
        return "admin/principal/list_users";
    }


}
