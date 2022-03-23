package com.bosonit.modelo;

public class Persona {

    private String nombre;
    private String ciudad;
    private String edad;

    public Persona(String nombre, String ciudad, String edad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String verDatos(){
        return ("Nombre: "+getNombre()+" Domicilio: "+getCiudad()+" Edad: "+getEdad());
    }
}
