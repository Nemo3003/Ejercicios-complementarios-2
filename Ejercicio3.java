package com.informatorio;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Ejercicio3 {
    public static void main(String [] args){
        ArrayList cartasFran = new ArrayList();
        cartasFran.add("2");
        cartasFran.add("3");
        cartasFran.add("4");
        cartasFran.add("5");
        cartasFran.add("6");
        cartasFran.add("7");
        cartasFran.add("8");
        cartasFran.add("9");
        cartasFran.add("10");
        cartasFran.add("J");
        cartasFran.add("Q");
        cartasFran.add("K");
        cartasFran.add("A");
        System.out.println("Inicio ordenado");
        for (int k = 0; k <cartasFran.size() ; k++) {
            System.out.println(cartasFran.get(k));
        }
        System.out.println("Fin ordenado");
        System.out.println("Inicio reverso");
        Collections.reverse(cartasFran);
        for (int i = 0; i <cartasFran.size() ; i++) {
            System.out.println(cartasFran.get(i));
        }
        System.out.println("Fin reverso");
        System.out.println("Inicio mezclado");
        Collections.shuffle(cartasFran);

        for (int j = 0; j <cartasFran.size() ; j++) {
            System.out.println(cartasFran.get(j));
        }
        System.out.println("Fin mezclado");

    }
}
