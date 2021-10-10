package com.informatorio;

import java.util.HashMap;
import java.util.HashSet;

public class Ejercicio6 {
    public static void main(String[]args){

        HashSet<String> nombreApellido = new HashSet<>();
        HashSet<Integer> dNI = new HashSet<>();
        HashSet<Integer> horasTrabajadas = new HashSet<>();
        HashSet<Integer> valorPorHora = new HashSet<>();
        HashMap<String, Integer> trabajado = new HashMap();

        nombreApellido.add("Juan perez");                dNI.add(1234);         horasTrabajadas.add(6);
        nombreApellido.add("Mariana Swamp");             dNI.add(2545);         horasTrabajadas.add(7);
        nombreApellido.add("Katherin Cocina");           dNI.add(4567);         horasTrabajadas.add(8);
        nombreApellido.add("Pedro Cordero");             dNI.add(7890);         horasTrabajadas.add(4);
        nombreApellido.add("Valentina VillaBlanca");     dNI.add(3698);         horasTrabajadas.add(5);

        valorPorHora.add(350);
        valorPorHora.add(345);
        valorPorHora.add(550);
        valorPorHora.add(600);
        valorPorHora.add(320);

       
    }
}
