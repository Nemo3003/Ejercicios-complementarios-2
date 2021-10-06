package com.informatorio;

import java.util.ArrayList;

public class Ejercicio1 {
    public static void main(String[] args){
        ArrayList list = new ArrayList();
        list.add("#1 - Bariloche");
        list.add("#2 - Cordoba");
        list.add("#3 - Resistencia");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
