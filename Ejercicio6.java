package com.informatorio;

import java.util.*;

public class Ejercicio6 {
//Completar...

    public static void main(String[] args)  {
        List<String> nombreApellido = new ArrayList<>();
        List<Integer> dni = new ArrayList<>();
        List<Integer> horasTrabajadas = new ArrayList<>();
        List<Integer> valorPorHora = new ArrayList<>();
        List<Integer> totales = new ArrayList<>();

        horasTrabajadas.add(6);           nombreApellido.add("Valeria");          dni.add(2565484);
        horasTrabajadas.add(7);           nombreApellido.add("Juan");             dni.add(3215646);
        horasTrabajadas.add(8);           nombreApellido.add("Valentina");        dni.add(8798654);
        horasTrabajadas.add(4);           nombreApellido.add("Viviana");          dni.add(3246548);
        horasTrabajadas.add(5);           nombreApellido.add("Victor");           dni.add(3454887);
        valorPorHora.add(350);
        valorPorHora.add(345);
        valorPorHora.add(550);
        valorPorHora.add(600);
        valorPorHora.add(320);

        for (int i = 0; i < horasTrabajadas.size(); i++) {
            //aquí tomo las horas trabajadas y se lo paso en multiplicacion al valor por hora
            int hs = horasTrabajadas.get(i) * valorPorHora.get(i);
            totales.add(hs);
        }
        int totalesHs = 0;
        for (Integer hs : totales) {
            totalesHs += hs;

        }

        Set<List<String>> nombre = new HashSet<>();
        nombre.add(nombreApellido);
        for (String s: nombreApellido) {
            System.out.println(s);
        }

        Set<List<Integer>> allJunto = new HashSet<>();
        allJunto.add(dni);
        allJunto.add(horasTrabajadas);
        allJunto.add(valorPorHora);
        allJunto.add(totales);

        for (List<Integer> num : allJunto) {
            System.out.println(num);
        }
        HashMap<Set<List<String>>, Set<List<Integer>>> theLista = new HashMap<>();
        theLista.put(nombre,allJunto);
        System.out.println(theLista);
    }
}
