package com.bosonit.CRUDrelaciones.modelo;

import javax.persistence.Id;

public class Profesor {

    @Id
    String id_profesor;

    String id_persona;
    String coments;
    String branch;

    public Profesor(String id_profesor, String id_persona, String coments, String branch) {
        this.id_profesor = id_profesor;
        this.id_persona = id_persona;
        this.coments = coments;
        this.branch = branch;
    }

    public String getId_profesor() {
        return id_profesor;
    }

    public void setId_profesor(String id_profesor) {
        this.id_profesor = id_profesor;
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

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}
