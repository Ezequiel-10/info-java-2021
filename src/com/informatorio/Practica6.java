package com.informatorio;

import java.util.Scanner;

public class Practica6 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int continuar = 1;
        int nro;

        while (continuar == 1) {
            System.out.print("Ingrese un numero por favor: ");
            //se tomara un numero con la variable ya iniciada fuera del while por eso no tiene "int"
            nro = scan.nextInt();
            System.out.println("El numero ingresado es " + nro);
            System.out.println("Si desea ingresar otro numero presine 1, de lo contrario se cerrara el programa");
            //se procede a pedir un valor para la variable condicional del while, si es distinto a 1 se cerrara el while
            continuar = scan.nextInt();
        }

        scan.close();
    }

}
