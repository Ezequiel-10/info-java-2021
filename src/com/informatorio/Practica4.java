package com.informatorio;

import java.util.Scanner;

public class Practica4 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int continuar = 1;
        int dia;

        do {
            System.out.print("ingrese un numero del 1 al 7: ");
            dia = scan.nextInt();


            switch (dia) {
                case 1:
                    System.out.println("Domingo");
                    break;
                case 2:
                    System.out.println("Lunes");
                    break;
                case 3:
                    System.out.println("Martes");
                    break;
                case 4:
                    System.out.println("Miercoles");
                    break;
                case 5:
                    System.out.println("Jueves");
                    break;
                case 6:
                    System.out.println("Viernes");
                    break;
                case 7:
                    System.out.println("Sabado");
                    break;
            }
            if (dia > 7){
                System.out.println("Del 1 al 7, BOBO!!");
            }
            System.out.println("CONTINUAR (1) O CERRAR (otro numero)");
            continuar = scan.nextInt();

        }while (continuar == 1);
        scan.close();

    }
}
