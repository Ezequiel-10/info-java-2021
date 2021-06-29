package com.ComplementariosLv2;

public class ejercicio7 {

	public static void main(String[] args) {
  	
		fizzBuzzFuncion(1,8);

	}

	public static void fizzBuzzFuncion(int n1, int n2){
		
		String[] salida = new String[n2];

		if (n2 > n1) {
			for (int i = 0; i < n2; i++) {
		
				if ((i % 2 == 0) && (i % 3 == 0)) {
					salida[i] = "FizzBuzz";
				}
				else if (i % 2 == 0) {
					salida[i] = "Fizz";
				}
				else if (i % 3 == 0) {
					salida[i] = "Buzz";
				}
				else {
					salida[i] = String.valueOf(i);
				}
					
			}
			
			for (int i = 0; i < n2; i++){
				System.out.print('"' + salida[i] + '"' + ",");
			}		

		} else {

				System.out.print("El segundo número debe ser mayor que el primero.");
			
			}

	}
}
