package com.sena.riap.entities;
import jakarta.persistence.*;



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
    @Column(name = "id_user")
    private Long IdUser;

    public Long getIdUserCourse() {
        return idUserCourse;
    }

    public void setIdUserCourse(Long idUserCourse) {
        this.idUserCourse = idUserCourse;
    }

    public Long getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(Long idCourse) {
        this.idCourse = idCourse;
    }

    public Long getIdUser() {
        return IdUser;
    }

    public void setIdUser(Long idUser) {
        IdUser = idUser;
    }
}
