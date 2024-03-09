package com.sena.riap.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import jakarta.persistence.*;


@Entity
@Table(name = "program")
public class Program {
    @Id
    @Column(name = "id_program")
    private Long idProgram;

    @NotBlank(message = "Name cannot be blank")
    @Size(max = 60, message = "The length of the name must be a maximum of 60 characters")
    @Column(name = "name_program")
    private String name;

    public Long getIdProgram() {
        return idProgram;
    }

    public void setIdProgram(Long idProgram) {
        this.idProgram = idProgram;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
