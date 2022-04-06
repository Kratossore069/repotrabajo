package com.bosonit.CRUDrelaciones.modelo;

import javax.persistence.Id;
import java.util.Date;

public class EstudianteAsignatura {

    @Id
    String id_asignatura

    String id_student;
    String asignatura;
    String coments;
    Date initial_date;
    Date finish_date;

    public EstudianteAsignatura(String id_asignatura, String id_student, String asignatura, String coments, Date initial_date, Date finish_date) {
        this.id_asignatura = id_asignatura;
        this.id_student = id_student;
        this.asignatura = asignatura;
        this.coments = coments;
        this.initial_date = initial_date;
        this.finish_date = finish_date;
    }

    public String getId_asignatura() {
        return id_asignatura;
    }

    public void setId_asignatura(String id_asignatura) {
        this.id_asignatura = id_asignatura;
    }

    public String getId_student() {
        return id_student;
    }

    public void setId_student(String id_student) {
        this.id_student = id_student;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public String getComents() {
        return coments;
    }

    public void setComents(String coments) {
        this.coments = coments;
    }

    public Date getInitial_date() {
        return initial_date;
    }

    public void setInitial_date(Date initial_date) {
        this.initial_date = initial_date;
    }

    public Date getFinish_date() {
        return finish_date;
    }

    public void setFinish_date(Date finish_date) {
        this.finish_date = finish_date;
    }
}
