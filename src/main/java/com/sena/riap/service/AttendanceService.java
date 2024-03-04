package com.sena.riap.service;



import com.sena.riap.entities.Attendance;

import java.util.List;

public interface AttendanceService {

    public List<Attendance> getAttendance();

    public Attendance saveAttendance(Attendance Attendance);

    public Attendance getAttendanceById(Long id);

    public Attendance updateAttendance(Long id,Attendance attendance);

    public void deleteAttendance (Long id);

    List<Attendance> getAttendancesByEventId(Long eventId);

    List<Attendance> getAttendancesByUserId(Long userId);
}
