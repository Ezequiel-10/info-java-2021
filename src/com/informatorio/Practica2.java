package com.informatorio;

import java.util.Scanner;

public class Practica2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int continuar = 1;

        int a;
        int b;
        int c;

        do {
            System.out.print("ingrese un numero: ");
            a = scan.nextInt(); //escanea el proximo entero que es ingresado.
            System.out.print("ingrese otro numero: ");
            b = scan.nextInt();
            System.out.print("ingrese otro numero: ");
            c = scan.nextInt();

            System.out.println("El primer numero ingresado es: " + a);
            System.out.println("El segundo numero ingresado es: " + b);
            System.out.println("El tercer numero ingresado es: " + c);
            System.out.println("si desea ingresar otros numeros presione 1, si no pulse cualquier otro ");
            continuar = scan.nextInt();
        } while (continuar == 1);
        scan.close();

    }
}
