package com.ComplementariosLv2;

import java.util.Scanner;

public class Ejercicio1 {
    //ranking de ciudades.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Cuanta ciudades favoritas quiere ingresar: ");
        int c = scan.nextInt();


        String[] t = new String[c];

        for (int i = 0; i < c; i++){
            System.out.print("Ingrese ciudad: ");
            t[i] = scan.next();
        }

        int con = 1;

        for (int i=0; i < c; i++) {
            System.out.println(t[i] + " #" + con++);
        }
    }


}
