package com.ComplementariosLv1;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Ingrese caracteres: ");
        String l = scan.nextLine();
        scan.close();

        String m = l.toUpperCase();

        System.out.println(m);

    }
}
