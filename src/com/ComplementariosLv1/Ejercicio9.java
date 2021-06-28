package com.ComplementariosLv1;

import java.util.Scanner;


public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("ingrese caracteres: ");
        String t = scan.nextLine();
        System.out.println("ingrese el caracter que quiere contar: ");
        String l = scan.nextLine();
        scan.close();

        int pos;
        int c = 0;

        pos = t.indexOf(l);

        while (pos != -1){
            c++;
            pos = t.indexOf(l, pos+1);
        }
        System.out.println("La cantidad de letras contadas son: " + c);

    }
}
