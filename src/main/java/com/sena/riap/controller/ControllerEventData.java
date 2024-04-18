package com.sena.riap.controller;

import com.sena.riap.entities.Attendance;
import com.sena.riap.entities.EventData;

import com.sena.riap.entities.UserData;
import com.sena.riap.service.AttendanceService;
import com.sena.riap.service.CourseService;
import com.sena.riap.service.EventDataService;
import com.sena.riap.service.UserDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @Autowired
    private AttendanceService attendanceService;

    @GetMapping("/listEvent")
    public String listEvents(@RequestParam(required = false) Integer courseNumber, Model model) {
        if (courseNumber != null) {
            List<EventData> eventData = eventDataService.findEventsByCourseNumber(courseNumber);
            model.addAttribute("events", eventData);
        }
        return "admin/principal/EventList";
    }

    @GetMapping("/createEvent")
    public String createNewEvent(Model model) {
        model.addAttribute("eventData", new EventData());
        model.addAttribute("action", "");
        return "admin/principal/CreateEvent";
    }
    /*
    @PostMapping("/createEvent")
    public String createNewEvent(@ModelAttribute EventData eventData,@RequestParam Integer courseNumber){
        eventDataService.saveEventData(eventData);
        return "redirect:/userData/principal";

    }
     */

    @PostMapping("/createEvent")
    public String createNewEvent(@ModelAttribute EventData eventData, @RequestParam("course") Integer courseNumber) {
        // Guardar el evento en la base de datos
        eventDataService.saveEventData(eventData);

        //la lista de aprendices asociados al curso
        List<UserData> learners = userDataService.getLearnersByCourseNumber(courseNumber);

        // Crear registros de asistencia vacIos para cada aprendiz asociado al curso
        for (UserData learner : learners) {
            Attendance attendance = new Attendance();
            attendance.setIdEvent(eventData.getIdEvent());
            attendance.setIdUser(learner.getIdUser());
            // No establecer la hora de asistencia por ahora xd
            attendanceService.saveAttendance(attendance);
        }

        return "redirect:/userData/principal";
    }

    @GetMapping("/deleteEvent/{eventId}")
    public String deleteEvent(@PathVariable Long eventId) {
        if (eventId != null) {
            try {
                attendanceService.deleteAllByEventId(eventId);
                eventDataService.deleteEventData(eventId);
                return "redirect:/eventData/listEvent";
            } catch (Exception e) {
                System.out.println("error deleteEvent method" + e);
            }
        } else {
            System.out.println("EVENT ID NOT FOUND");
        }
        return "redirect:/eventData/listEvent";
    }

// peligro tractomula
    @GetMapping("/updateEvent/{eventId}")
    public String updateEvent(Model model, @PathVariable Long eventId) {
        model.addAttribute("eventData", eventDataService.getEventDataById(eventId));
        model.addAttribute("action", "/eventData/updateEvent/"+ eventId);
        return "admin/principal/CreateEvent";
    }

    @PostMapping("/updateEvent/{eventId}")
    public String updateEvent(@PathVariable Long eventId, EventData updatedEventData) {
        eventDataService.updateEventData(eventId,updatedEventData);
        return "redirect:/eventData/listEvent";
    }
// peligro cola de la tractomula

    @ModelAttribute("courseNumbers")
    public List<Integer> allCourseNumbers() {
        UserData user = userDataService.getLoggedInUser();
        Long idUser = user.getIdUser();
        return courseService.getCoursesByUser(idUser);
    }

}
