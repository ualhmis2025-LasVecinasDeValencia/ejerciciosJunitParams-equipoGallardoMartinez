package ual.hmis.sesion06.ejercicio5;

import java.io.IOException;
import java.util.List;

public class main {

	public static void main(String[] args) throws IOException {

		ContadorDePalabras palabras = new ContadorDePalabras(); 
		
		List<String> lista = palabras.leerPalabras(); 
		
		for(String palabra : lista) {
			
			System.out.println(palabra);	
		}
			
	}

}
