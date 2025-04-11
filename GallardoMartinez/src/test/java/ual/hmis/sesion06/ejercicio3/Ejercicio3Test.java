package ual.hmis.sesion06.ejercicio3;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Ejercicio3Test {
	
	
	
	@ParameterizedTest
	@CsvSource( {
		"textoEjemplo.txt, password demasiado corto",
		"anton, ********",
		"anton123, ********",
		"anton1234567, ************",
		"a7B9kLm2QwXzP4rT6uVjYc3NdEeHgFiKoLpMtZxW, ************", 
		"a7B9kLm2QwXzP4rT6uVjYc3NdEeHgFiKoLpMtZxW1, password demasiado largo",
		"'', password demasiado corto"
		
	})
	
	
	
	void enmascararContraseña(String contraseña, String cadenaDeSalida) {
		
		//Arrange: 
		Ejercicio3 ejercicio = new Ejercicio3(); 
		
		//Act
		String cadenaFinal = ejercicio.enmascararContraseña(contraseña); 
		//Assert
		
		assertEquals(cadenaDeSalida, cadenaFinal); 
		
		
	}
	
	
	
	
	

	
	

}
