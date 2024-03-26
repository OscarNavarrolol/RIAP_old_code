package com.sena.riap.controller;

import com.sena.riap.entities.EventData;

import com.sena.riap.service.EventDataService;
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

    @GetMapping("/listEvent")
    public String listEvents (Model model) {
        List<EventData> eventData = eventDataService.getEventData();
        model.addAttribute("event", eventData);
        return "admin/principal/ListUsers";
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
        return "admin/principal/CreateEvent";
    }


}
