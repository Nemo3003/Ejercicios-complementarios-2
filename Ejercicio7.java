package com.informatorio;

import javax.lang.model.type.ErrorType;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[]args){

        int num1;
        int num2;
        List<Integer> numTotal = new ArrayList<>();
        Scanner numIngresado = new Scanner(System.in);
        System.out.println("Ingrese su primer numero, que sea del 2 al 10: ");
        num1 = numIngresado.nextInt();
        numIngresado.nextLine();
        System.out.println("Ingrese su segundo numero, el más grande: ");
        num2 = numIngresado.nextInt();
        numIngresado.nextLine();
        int num3 = (num2 + 1);

            if (num1 == 5 || num1 == 7 || num1 == 1) {
                System.out.println("Numero invalido, ingrese un numero multiplo de 2 o 3");
            } else {
                int calculo = num1 % 2;

                if (calculo == 0) {
                    for (int i = num1; i < num3; i++) {
                        System.out.println(i + ". Fizz");
                    }
                } else if (calculo == 1) {
                    for (int i = num1; i < num3; i++) {
                        System.out.println(i + ". Buzz");
                    }
                }
            }


        }
    }


