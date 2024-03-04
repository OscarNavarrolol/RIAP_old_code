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
    private Long idUserCourse;

    //@ManyToOne(cascade = CascadeType.ALL)
    @Column(name = "id_course")
    private Long idCourse;

    // @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_user")
    private Long IdUser;

}
