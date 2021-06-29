/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.time.LocalDate;
import java.util.Comparator;

/**
 *
 * @author Maximiliano
 */
public class Empleados implements Comparable<Empleados>{
    
    private String nombre;
    private String apellido;
    private LocalDate fecnac;
    private double sueldo;

    public Empleados(String nombre, String apellido, LocalDate fecnac,  double sueldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecnac = fecnac;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public LocalDate getFecnac() {
        return fecnac;
    }

    public void setFecnac(LocalDate fecnac) {
        this.fecnac = fecnac;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    

    @Override
    public String toString() {
        return "Empleados{" + "nombre=" + nombre + ", apellido=" + apellido + ", fecnac=" + fecnac +  ", sueldo=" + sueldo + '}'+"\n";
    }

    @Override
    public int compareTo(Empleados t) {
        if (this.getSueldo() < t.getSueldo()) {
            return -1;
        }
        else if (this.getSueldo() > t.getSueldo()) {
            return 1;
        }
        return 0;
    }
    
}


