package com.ComplementariosLv2;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {
    public static void main(String[] args) {

        List<String> nombres = new ArrayList<>();

        nombres.add("Raul"); //se podria hacer con un scaner y un for, pero para el ejercicio ponemos directamente.
        nombres.add("Paula");
        nombres.add("Lurdes");
        nombres.add("Ramiro");
        nombres.add("Ruperto");
        nombres.add("Rial");
        nombres.add("Alejandra");
        nombres.add("Florencia");
        nombres.add("Carlos");
        nombres.add("Anabel");
        nombres.add("Rojelio");
        nombres.add("Ricardo");
        System.out.println("Personas anotadas:");

        for (String nom: nombres) {
            System.out.println(nom);
        }
        System.out.println("*****************************************************************");
        List<String> curso1;
        curso1 = nombres.subList(0,4);
        System.out.println("Intregrantes del curso 1:");
        for (String c1: curso1) {
            System.out.println(c1);
        }
        System.out.println("*****************************************************************");

        List<String> curso2;
        curso2 = nombres.subList(4,8);
        System.out.println("Intregrantes del curso 2:");
        for (String c2: curso2) {
            System.out.println(c2);
        }
        System.out.println("*****************************************************************");

        List<String> curso3;
        curso3 = nombres.subList(8,12);
        System.out.println("Intregrantes del curso 3:");
        for (String c3: curso3) {
            System.out.println(c3);
        }
        System.out.println("*****************************************************************");


    }
}
