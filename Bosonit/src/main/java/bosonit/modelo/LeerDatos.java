package com.bosonit.modelo;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Optional;

import com.bosonit.modelo.Persona;

public class LeerDatos {

    /**
     * FUNCION QUE GUARDA EL RESULTADO EN UNA
     * LISTA DE LOS VALORES DE UN DOCUMENTO EXTERNO
     * @param documento que se quiere leer
     * @return lista de componentes
     */
    public ArrayList<String> leerDocumento(String documento){

        ArrayList<String> result = new ArrayList<>();
        try (FileReader f = new FileReader(documento)) {
            StringBuffer sb = new StringBuffer();
            while (f.ready()) {
                char c = (char) f.read();
                if (c == '\n') {
                    result.add(sb.toString());
                    sb = new StringBuffer();
                } else {
                    sb.append(c);
                }
            }
            if (sb.length() > 0) {
                result.add(sb.toString());
            }
        }catch (IOException e){
            System.out.println("Error al leer el archivo.");
        }
        return result;
    }

    /**
     * METODO QUE LEE LOS DATOS RECIBIDOS
     * Y LOS MUESTRA POR PANTALLA
     * @param documento que se quiere leer
     */
    public void listaPersonas(String documento){

        ArrayList<String> listaRecibida = leerDocumento(documento);
        ArrayList<Persona> listaPersonas = new ArrayList<Persona>();

        for(String e:listaRecibida){
            String valor[] = e.split(":");
            listaPersonas.add(new Persona(valor[0],valor[1],valor[2]));
        }

        for(int i=0; i<listaPersonas.size();i++){
            Persona persona = listaPersonas.get(i);
            try{
                int edad = Integer.parseInt(persona.getEdad());
                if(edad<25){
                    System.out.println(persona.verDatos());
                }
            }catch (Exception ex){
                System.out.println("Un valor tipo texto no puede ser número");
            }
        }
    }
}
