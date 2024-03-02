package com.sena.riap.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "event_data")
public class EventData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_event")
    private Long idEvent;

    @NotNull(message = "Date cannot be null")
    @Future(message = "Date must be in the future")
    @Column(name = "date_event")
    private LocalDate date;

    @NotBlank(message = "Objective cannot be blank")
    @Size(min = 4, message = "Objective length must be at least 4 characters")
    private String objective;

    @Column(name = "start_time")
    @NotNull(message = "Start time cannot be null")
    private LocalDate startTime;

    @Column(name = "end_time")
    @NotNull(message = "End time cannot be null")
    private LocalDate endTime;

    @NotBlank(message = "location cannot be blank")
    private String location;
}
