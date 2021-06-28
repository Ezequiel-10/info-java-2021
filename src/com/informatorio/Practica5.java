package com.informatorio;

import java.util.Scanner;

public class Practica5 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in); //creamos un objeto scaner para que tome los valores de entrada.

        //iniciamos la variable continuar para el while
        int continuar = 1;
        //iniciamos la variable num.
        int num;


        do {
            System.out.print("ingrese un numero para multiplicarlo: ");

            num = scan.nextInt();

            for (int i=1; i <= 10; i++){
                System.out.println(num + " X " + i + "= " + num * i ); //creamos el mensaje con concatenaciones.
            }

            //PREGUNTAMOS SI CERRAMOS EL WHILE
            System.out.println("CONTINUAR (1) O CERRAR (otro numero)");
            continuar = scan.nextInt();

        }while (continuar == 1);

        scan.close(); //cerramos el sacaner si no lo usamos mas (buena practica).

    }
}
