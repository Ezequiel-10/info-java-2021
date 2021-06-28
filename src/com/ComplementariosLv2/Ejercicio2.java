package com.ComplementariosLv2;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {


    public static void main(String[] args) {
        List<Integer> mi_list= new ArrayList<>();

        mi_list.add(8);
        mi_list.add(2);
        mi_list.add(5);
        mi_list.add(3);
        mi_list.add(1);

        System.out.println("Elementos de la lista: " + mi_list.size());

        for (int i=0; i < mi_list.size(); i++){
            System.out.print(mi_list.get(i) + ", ");
        }
        System.out.println("*");


        System.out.println("Agregamos un 10 al principio");
        mi_list.add(0,10);

        for (int i=0; i < mi_list.size(); i++){
            System.out.print(mi_list.get(i) + ", ");
        }
        System.out.println("*");


        System.out.println("Agregamos un 20 al final");
        mi_list.add(mi_list.size(), 20);

        for (int i=0; i < mi_list.size(); i++){
            System.out.print(mi_list.get(i) + ", ");
        }
        System.out.println("*");


        System.out.println("Elementos de la lista: " + mi_list.size());


    }
}
