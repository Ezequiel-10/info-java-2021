package com.ComplementariosLv1;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese su nombre y apellido: ");
        String nombre = scan.nextLine();
        System.out.print("ingrese su edad: ");
        String edad = scan.nextLine();
        System.out.print("Ingrese su direccion: ");
        String direccion = scan.nextLine();
        System.out.print("ingrese su ciudad: ");
        String ciudad = scan.nextLine();
        scan.close();

        System.out.println(ciudad + " - " + direccion + " - " + edad + " - " + nombre);
    }
}
