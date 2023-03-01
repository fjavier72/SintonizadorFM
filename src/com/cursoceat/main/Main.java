package com.cursoceat.main;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Variables y objetos
		Scanner input = new Scanner(System.in);
		input.useLocale(Locale.ENGLISH);
		String opcion;
		SintonizadorFM miRadioFm = new SintonizadorFM();
		
		do {
			System.out.println(" _______________________");
			System.out.println("|                       |");
			System.out.println("|     RADIO FM JAVA     |");
			System.out.println("|                       |");
			System.out.println("|  (+) Avanzar dial     |");
			System.out.println("|  (-) Retroceder dial  |");
			System.out.println("|  (*) Agregar favorito |");
			System.out.println("|  (s) Apagar la radio  |");
			System.out.println("|_______________________|");
			
			System.out.print("\n Seleccione una opción: ");
			opcion = input.nextLine();
			
			
			switch (opcion) {
			case "+" -> {
				miRadioFm.up();
				miRadioFm.display();
			}
			case "-" -> {
				miRadioFm.down();
				miRadioFm.display();
			}
			case "*" -> {
				System.out.print("Indique la frecuencia deseada: ");
				double frecuencia = input.nextDouble();
				input.nextLine();  // Limpiamos el buffer del scanner
				miRadioFm.setFrecuencia(frecuencia);
				miRadioFm.display();
			}
			case "s" -> System.out.println("Aplicación terminada...");
			}
		} while (!opcion.equals("s"));
		
		input.close();
	}

}
