package com.sena.riap.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "user_data")
public class UserData {
    @Id
    @Column(name = "id_user")
    private long idUser;

   // @Min(value = 1000, message = "Document number must be greater than or equal to 1000")
    @Column(name = "document_number")
    private String document;

    @NotBlank(message = "age cannot be blank")
    private int age;

    @NotBlank(message = "Name cannot be blank")
    // @Size(max = 60, message = "Name length must be less than or equal to 40 characters")
    @Column(name = "full_name")
    private String nameUser;

    @NotBlank(message = "email cannot be blank")
    private String email;

    @NotBlank(message = "Phone cannot be blank")
    // @Size(min = 10, max = 10, message = "Phone number must be exactly 10 digits")
    private String phone;

    @Column(name = "role_user")
    private String roleUser;
    @Column(name = "password_user")
    private String password;
    @Column(name = "profile_picture")
    private String profilePicture;

}

