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

    /*
    @DeleteMapping("/deleteEvent/{eventId}")
    public String deleteEvent(@PathVariable Long eventId) {

        if (eventDataService.existsById(eventId)) {

            attendanceService.deleteByEventId(eventId);


            eventDataService.deleteById(eventId);

            return "Evento y asistencias asociadas eliminados exitosamente";
        } else {
            return "El evento con ID " + eventId + " no existe";
        }
    }

     */

    /*

    @GetMapping("/createEvent")
    public String updateEvent(Model model) {
        model.addAttribute("eventData", aaaaaa);
        model.addAttribute("action", "/eventData/createEvent");
        return "admin/principal/CreateEvent";
    }

    @PotMapping("/updateEvent/{eventId}")
    public String updateEvent(@PathVariable Long eventId, @RequestBody EventData updatedEventData) {

        if (eventDataService.existsById(eventId)) {

            updatedEventData.setIdEvent(eventId);


            eventDataService.saveEventData(updatedEventData);

            return "Evento actualizado";
        } else {
            return "El evento con ID " + eventId + " no existe";
        }
    }
     */

    @ModelAttribute("courseNumbers")
    public List<Integer> allCourseNumbers() {
        UserData user = userDataService.getLoggedInUser();
        Long idUser = user.getIdUser();
        return courseService.getCoursesByUser(idUser);
    }

}
