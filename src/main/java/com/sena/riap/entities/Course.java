package com.sena.riap.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_course")
    private Long idCourse;

    @NotNull(message = "Number cannot be null")
    private Integer number;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_program")
    private Program program;


}
