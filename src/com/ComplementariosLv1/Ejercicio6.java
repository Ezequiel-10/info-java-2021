package com.ComplementariosLv1;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("ingrese un numero: ");
        int n1= scan.nextInt();
        System.out.print("ingrese otro numero: ");
        int n2 = scan.nextInt();
        scan.close();
        int num = 1;

        for (int i=1; i <= n2; i++){
            num*=n1;
        }
        System.out.println(n1+" elevado a la " + n2 + " es: " + num);

    }
}
