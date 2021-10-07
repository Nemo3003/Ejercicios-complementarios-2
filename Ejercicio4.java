package com.informatorio;

import java.util.ArrayList;

public class Ejercicio4 {
    public static void main(String[] args){

        System.out.println("Los estudiantes de la clase numero 1 son: ");
        indPosicion(0,4);
        System.out.println("Los estudiantes de la clase numero 2 son: ");
        indPosicion(4,8);
        System.out.println("Los estudiantes de la clase numero 3 son: ");
        indPosicion(8,12);
    }
    static void indPosicion (int inicio,int fin){
        ArrayList estudiante = new ArrayList();
        estudiante.add("Juan");
        estudiante.add("Osvaldo");
        estudiante.add("Juana");
        estudiante.add("Sebastian");
        estudiante.add("Lourdes");
        estudiante.add("Aldana");
        estudiante.add("Marcelo");
        estudiante.add("Maria");
        estudiante.add("Macarena");
        estudiante.add("Braian");
        estudiante.add("Lorena");
        estudiante.add("Jose");
        for (int i = inicio; i < fin; i++) {
            System.out.println(estudiante.get(i));
        }

    }
}
