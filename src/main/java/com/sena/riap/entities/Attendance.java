package com.sena.riap.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "attendance")
public class Attendance {

    @Id
    @Column(name = "id_attendance")
    private Long idAttendance;

    // @NotNull(message = "Event cannot be null")
    // @ManyToOne(fetch = FetchType.LAZY)
    @Column(name = "id_event")
    private Long idEvent;

    // @NotNull(message = "User cannot be null")
    //  @ManyToOne(fetch = FetchType.LAZY)
    @Column(name = "id_user")
    private Long idUser;

    @NotNull(message = "Attendance time cannot be null")
    @Column(name = "attendance_time")
    private LocalDateTime attendanceTime;

    public Long getIdAttendance() {
        return idAttendance;
    }

    public void setIdAttendance(Long idAttendance) {
        this.idAttendance = idAttendance;
    }

    public Long getIdEvent() {
        return idEvent;
    }

    public void setIdEvent(Long idEvent) {
        this.idEvent = idEvent;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public LocalDateTime getAttendanceTime() {
        return attendanceTime;
    }

    public void setAttendanceTime(LocalDateTime attendanceTime) {
        this.attendanceTime = attendanceTime;
    }
}
