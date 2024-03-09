package com.sena.riap.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.time.LocalDate;


@Entity
@Table(name = "event_data")
public class EventData {
    @Id
    @Column(name = "id_event")
    private Long idEvent;

    @NotNull(message = "Date cannot be null")
    @Future(message = "Date must be in the future")
    @Column(name = "date_event")
    private LocalDate date;

    @NotBlank(message = "Objective cannot be blank")
    @Size(max = 255,message = "The length of the objective must be a maximum of 255 characters")
    private String objective;

    @Column(name = "start_time")
    @NotNull(message = "Start time cannot be null")
    private LocalDate startTime;

    @Column(name = "end_time")
    @NotNull(message = "End time cannot be null")
    private LocalDate endTime;

    @NotBlank(message = "location cannot be blank")
    @Size(max = 100,message = "The length of the location must be a maximum of 255 characters")
    private String location;

    public Long getIdEvent() {
        return idEvent;
    }

    public void setIdEvent(Long idEvent) {
        this.idEvent = idEvent;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getObjective() {
        return objective;
    }

    public void setObjective(String objective) {
        this.objective = objective;
    }

    public LocalDate getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDate startTime) {
        this.startTime = startTime;
    }

    public LocalDate getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDate endTime) {
        this.endTime = endTime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
