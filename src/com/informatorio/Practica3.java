package com.informatorio;

import java.util.Scanner;

public class Practica3 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int nota;
        int continuar = 1;

        do {
            System.out.print("Ingrese su nota: ");
            nota = scan.nextInt();

            if (nota > 92 && nota < 101){
                System.out.println("Excelente");
            } else if (nota > 84 && nota < 101) {
                System.out.println("Sobresaliente");
            } else if (nota > 74 && nota < 101) {
                System.out.println("Distinguido");
            } else if (nota > 59 && nota < 101) {
                System.out.println("Bueno");
            } else {
                System.out.println("Desaprobado");
            }

            System.out.println("CONTINUAR (1) O CERRAR (otro numero)");
            continuar = scan.nextInt();

        } while (continuar == 1);
        scan.close();




    }
}
