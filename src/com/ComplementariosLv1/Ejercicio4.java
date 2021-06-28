package com.ComplementariosLv1;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un numero para factorial: ");
        int n = scan.nextInt();
        scan.close();

        double r=1;

        for (int i=2; i <= n; i++){
            r*=i;
        }
        System.out.println("El factorial de "+ n +" es: " + r);
    }
}
