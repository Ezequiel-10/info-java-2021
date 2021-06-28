package com.ComplementariosLv1;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("ingrese un numero para su cuenta: ");
        int n = scan.nextInt();
        scan.close();

        contador(n);

    }

    public static void contador(int numero){

        for (int i=1; i <= numero; i++ ){

            System.out.println(i);
        }
    }
}
