package com.sena.riap.service.impl;

import com.sena.riap.entities.Attendance;
import com.sena.riap.repository.AttendanceRepository;
import com.sena.riap.service.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttendanceServiceImpl implements AttendanceService {

    @Autowired
    private AttendanceRepository attendanceRepository;

    @Override
    public List<Attendance> getAttendance() {
        return attendanceRepository.findAll();
    }

    @Override
    public Attendance saveAttendance(Attendance attendance) {
        return attendanceRepository.save(attendance);
    }

    @Override
    public Attendance getAttendanceById(Long id) {
        return null;
    }

    @Override
    public Attendance updateAttendance(Long id, Attendance attendance) {
        return null;
    }

    @Override
    public void deleteAttendance(Long id) {

    }

    @Override
    public List<Attendance> getAttendancesByEventId(Long eventId) {
        return null;
    }

    @Override
    public List<Attendance> getAttendancesByUserId(Long userId) {
        return null;
    }
}
