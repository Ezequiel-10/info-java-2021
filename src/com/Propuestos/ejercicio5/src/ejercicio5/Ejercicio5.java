/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import clases.Empleados;
import java.util.List;
import java.util.regex.Pattern;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Maximiliano
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Lectura del archivo txt
        
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        System.out.println("Lista de empleados: ");
	List<Empleados> empleado = new ArrayList<>();
	File file = new File("C:\\Users\\Maximiliano\\Documents\\Informatorio\\Java\\Practica\\Propuestos\\empleados.txt");
	try {

	    BufferedReader stream = new BufferedReader(new FileReader(file));
	    String br;

	    String nombre = null, apellido = null;
	    double sueldo = 0;
	    LocalDate fechaNacimiento = null;
			
	    String separador = Pattern.quote(",");
	    String[] Palabra = null;
			
	    while ((br = stream.readLine()) != null) {
				
	        Palabra = br.split(separador);
		nombre = Palabra[0];
		apellido = Palabra[1];
		fechaNacimiento = LocalDate.parse(Palabra[2], formato);
		sueldo = Double.parseDouble(Palabra[3]);
		empleado.add(new Empleados(nombre, apellido, fechaNacimiento, sueldo));
		}
			
		for(int i = 0; i< empleado.size(); i++){
	            System.out.println(empleado.get(i));
	        }
			
			

	} catch (IOException e) {
	    System.out.println(e);
	}	
        
        // Empleados con una letra dada.
        
        System.out.println("");
              
        char letra = 'S';
        for (Empleados e: empleado){
            if (e.getApellido().charAt(0) == letra){
                System.out.println("Empleados con la letra ingresada: " + e.getNombre() + " " + e.getApellido());
            }
        };
        System.out.println();
        

        // Devuelve el empleado con el menor sueldo y con el mayor sueldo.
        
        Collections.sort(empleado);
        System.out.println("Empleado con el menor suedo es: " + empleado.get(0).getNombre() + " " + empleado.get(0).getApellido() + " $" + empleado.get(0).getSueldo());
        System.out.println("Empleado con el mayor suedo es: " + empleado.get(empleado.size() - 1).getNombre() + " " + empleado.get(empleado.size() - 1).getApellido() + " $" + empleado.get(empleado.size() - 1).getSueldo());
        System.out.println();

        // Devuelve el empleado más jovén y más viejo.

       	Period edadMayor = null;
	Period edadMenor = null;
	Empleados mayor = empleado.get(0);
	Empleados menor = empleado.get(0);
			
	for (int i = 0; i < empleado.size(); i++) {
	    if(mayor.getFecnac().getYear() > empleado.get(i).getFecnac().getYear()) 
		mayor = empleado.get(i);				
	    if(menor.getFecnac().getYear() < empleado.get(i).getFecnac().getYear()) 
		menor = empleado.get(i);	
	}
	
        // Devuelve el empleado más viejo
        edadMayor = Period.between(mayor.getFecnac(), LocalDate.now()); 
        
        // Devuelve el empleado más jovén
	edadMenor = Period.between(menor.getFecnac(), LocalDate.now()); 
        
        System.out.println("El empleado más viejo es: " + mayor.getNombre() + " " + mayor.getApellido() + " con " + edadMayor.getYears() + " años.");
        System.out.println("El empleado más jovén es: "+ menor.getNombre() + " " + menor.getNombre() + " con " + edadMenor.getYears() + " años.");
	System.out.println();
        
        
}

}
