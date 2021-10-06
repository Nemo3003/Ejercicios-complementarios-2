package com.informatorio;

import java.util.ArrayList;

public class Ejercicio2 {
    public static void main(String[]args){
        ArrayList numEntero = new ArrayList();
        numEntero.add(7);
        numEntero.add(5);
        numEntero.add(9);
        numEntero.add(6);
        numEntero.add(8);
        numEntero.add(7);
        numEntero.add(9);
        for (int i = 0; i < numEntero.size(); i++) {
            System.out.println("Numeros en la lista: "+numEntero.get(i));
        }
        System.out.println("Cantidad de numeros en la lista despues de agregar dos: "+numEntero.size());
        numEntero.remove(0);
        numEntero.remove(5);
        System.out.println("Cantidad de numeros en la lista antes de agregar dos: "+numEntero.size());
    }
}
