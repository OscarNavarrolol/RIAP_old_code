package com.sena.riap.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "user_course")
public class UserCourse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user_course")
    private Long idUserRecord;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_course")
    private Course course;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_user")
    private UserData userData;

}
