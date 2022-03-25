package com.bosonit;


import com.bosonit.modelo.LeerDatos;

public class Main {
    /* Funcion que arranca todo el programa */
    public static void main(String[] args) {
        LeerDatos leer = new LeerDatos();
        leer.listaPersonas("/home/victor/IdeaProjects/Bosonit/src/main/java/bosonit/pages/datos.txt");
    }
}
