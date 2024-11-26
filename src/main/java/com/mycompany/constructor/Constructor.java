/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.constructor;

/**
 *
 * @author JANETH
 */
public class Constructor {

    public static void main(String[] args) {
        
        Padre persona = new Padre("juan", "Galindez", 50, "1974-04-10");
        System.out.println("Datos del padre:");
        persona.mostrarInformacion();

        System.out.println("\n");

        hijo estudiante = new hijo("juanita", "Galindez", 20, "2004-08-15");
        System.out.println("Datos del hijo:");
        estudiante.mostrarInformacion();

        System.out.println("\n");

        System.out.println("Nombre del hijo: " + estudiante.getNombre());
        System.out.println("Apellido del hijo: " + estudiante.getApellido());
        System.out.println("Nombre del padre: " + persona.getNombre());
        System.out.println("Nombre del padre: " + persona.getApellido());



    }
}

