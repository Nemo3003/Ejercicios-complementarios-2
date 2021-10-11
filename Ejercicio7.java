package com.informatorio;

import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//Terminar los detalles...
public class Ejercicio7 {
    public static void main(String args[]){
        int num1;
        int num2;

        Scanner numIngresado = new Scanner(System.in);
        List<Integer> numTotal = new ArrayList<>();
        System.out.println("Ingrese su primer numero, que sea del menor: ");
        num1 = numIngresado.nextInt();
        numIngresado.nextLine();
        System.out.println("Ingrese su segundo numero, el más grande: ");
        num2 = numIngresado.nextInt();
        numIngresado.nextLine();

        if(num1%2==0 && num1%3 == 0){
            for (int i = num1; i < num2; i++) {
                System.out.println(i + ". FizzBuzz");
            }
        }
        else if(num1%3 ==0){
            for (int i = num1; i < num2; i++) {
                System.out.println(i + ". Buzz");
            }
        }
        else if(num1%2 == 0 ){
            for (int i = num1; i < num2; i++){
                System.out.println(i + ". Fizz");
            }
        }
        else {
            System.out.println("Lo siento, pero no se encuentra ese numero...");
        }
        }
    }


