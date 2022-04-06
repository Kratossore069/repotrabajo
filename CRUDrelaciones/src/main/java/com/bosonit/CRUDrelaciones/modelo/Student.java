package com.bosonit.CRUDrelaciones.modelo;

import javax.persistence.Id;

public class Student {

    @Id
    String id_student;

    String id_persona;
    String coments;
    String id_profesor;

    public Student(String id_student, String id_persona, String coments, String id_profesor) {
        this.id_student = id_student;
        this.id_persona = id_persona;
        this.coments = coments;
        this.id_profesor = id_profesor;
    }

    public String getId_student() {
        return id_student;
    }

    public void setId_student(String id_student) {
        this.id_student = id_student;
    }

    public String getId_persona() {
        return id_persona;
    }

    public void setId_persona(String id_persona) {
        this.id_persona = id_persona;
    }

    public String getComents() {
        return coments;
    }

    public void setComents(String coments) {
        this.coments = coments;
    }

    public String getId_profesor() {
        return id_profesor;
    }

    public void setId_profesor(String id_profesor) {
        this.id_profesor = id_profesor;
    }
}
