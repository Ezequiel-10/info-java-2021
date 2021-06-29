package com.ComplementariosLv2;

import java.util.ArrayList;
import java.util.List;

public class ejercicio5 {
    
    public static void main(String[] args) {
    
    List<Integer> horas_trabajadas = new ArrayList<>();
    horas_trabajadas.add(1);
    horas_trabajadas.add(2);
    horas_trabajadas.add(3);
    horas_trabajadas.add(4);
    horas_trabajadas.add(5);
    
    List<Integer> valor_por_hora = new ArrayList<>();
    valor_por_hora.add(100);
    valor_por_hora.add(200);
    valor_por_hora.add(100);
    valor_por_hora.add(300);
    valor_por_hora.add(400);
    
    List<Integer> sueldo_dia = new ArrayList<>();

    int dia = 0;

    for (int i = 0; i < horas_trabajadas.size(); i++) {
        dia = horas_trabajadas.get(i) * valor_por_hora.get(i);
        sueldo_dia.add(dia);
    }

    int Total = 0;

    for (int i = 0; i < sueldo_dia.size(); i++) {
        Total = Total + sueldo_dia.get(i);
    }

    System.out.println(sueldo_dia);
    System.out.println("Total final: $" + Total);

    }
}

