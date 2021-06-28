package com.ComplementariosLv2;

import java.util.*;

public class Ejercicio3 {

    public static void main(String[] args) {
        List<Integer> cartas= new ArrayList<>();

        for (int i=1; i <= 10; i++){
            cartas.add(i);
        }
        for (Integer car: cartas){
            System.out.print(car + ", ");
        }
        System.out.println("*");

        System.out.println("ORDEN INVERSO!!");
        cartas.sort(Comparator.reverseOrder());
        for (Integer car: cartas) {
            System.out.print(car + ", ");
        }
        System.out.println("*");

        System.out.println("MEZCLAMOS!!");
        Collections.shuffle(cartas);
        for (Integer car: cartas) {
            System.out.print(car + ", ");
        }
        System.out.println("*");

    }
}
