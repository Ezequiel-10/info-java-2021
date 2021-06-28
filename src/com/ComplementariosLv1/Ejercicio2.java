package com.ComplementariosLv1;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int n1 = scan.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int n2 = scan.nextInt();
        scan.close();

        int c = n1 - n2;
        int s = n1 + n2;

        System.out.println(n1 + " + " + n2 + "= " + s);
        System.out.println(n1 + " - " + n2 + "= " + c);
        System.out.println(n1 + " X " + n2 + "= " + n1*n2);
        System.out.println(n1 + " / " + n2 + "= " + n1/n2);
        System.out.println(n1 + " % " + n2 + "= " + n1%n2);
    }
}
