package com.ComplementariosLv2;

import java.util.*;

public class ejercicio6 {
    public static void main(String[] args){
        
        Empleados emp1 = new Empleados("Carlos Silva", 18096857, 30, 300);
        Empleados emp2 = new Empleados("Alejandra Perez", 22486290, 36, 300);

        Set<Empleados> empleados = new HashSet<>();
        empleados.add(emp1);
        empleados.add(emp2);

        Map<Integer, Integer> sueldo = new HashMap<>();

        for(Empleados emple: empleados){
            sueldo.put(emple.getDni(), (emple.getHorasTrabajadas() * emple.getValorPorHora()));
        }

        System.out.println(sueldo);

          
    }
}


class Empleados{

    private String nombreyapellido;
    private int dni;
    private int horasTrabajadas;
    private int valorPorHora;

    Empleados(String nombreyapellido, int dni, int horasTrabajadas, int valorPorHora){
        this.nombreyapellido = nombreyapellido;
        this.dni = dni;
        this.horasTrabajadas = horasTrabajadas;
        this.valorPorHora = valorPorHora;
    }

    //NOMBRE

    public void setNombreYApellido(String nombreyapellido){
        this.nombreyapellido = nombreyapellido;
    }

    public String getNombreYApellido(){
        return this.nombreyapellido;
    }

    //DNI

    public void setDni(int dni){
        this.dni = dni;
    }

    public int getDni(){
        return this.dni;
    }

    //HORAS TRABAJADAS

    public void setHorasTrabajadas(int horasTrabajadas){
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getHorasTrabajadas(){
        return this.horasTrabajadas;
    }

    //VALOR POR HORA

    public void setValorPorHora(int valorPorHora){
        this.valorPorHora = valorPorHora;
    }

    public int getValorPorHora(){
        return this.valorPorHora;
    }

    @Override
    public String toString(){
        return nombreyapellido + ", " + dni + ", " + horasTrabajadas + ", " + valorPorHora +".";
    }


}