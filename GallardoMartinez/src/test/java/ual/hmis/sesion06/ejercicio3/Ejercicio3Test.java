package ual.hmis.sesion06.ejercicio3;

import static org.junit.Assert.assertEquals;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class Ejercicio3Test {
	
	
	
	@ParameterizedTest
	
	@CsvFileSource(files = "src/test/java/ual/hmis/sesion06/ejercicio3/datos.csv")

	
	
	void enmascararContraseña(String contraseña, String cadenaDeSalida) {
		
		//Arrange: 
		Ejercicio3 ejercicio = new Ejercicio3(); 
		
		//Act
		String cadenaFinal = ejercicio.enmascararContraseña(contraseña); 
		//Assert
		
		assertEquals(cadenaDeSalida, cadenaFinal); 
		
		
	}
	
	
	
	
	

	
	

}
