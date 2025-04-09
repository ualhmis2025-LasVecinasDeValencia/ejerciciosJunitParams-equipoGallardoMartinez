package ual.hmis.sesion06.ejercicio1;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Ejercicio1Test {
	
	
	Ejercicio1 ejercicio1 = new Ejercicio1(); 
	
	
	
	//Arrange
	@ParameterizedTest (name = "{index} => Con entrada ({0}) sale {1}")
	@CsvSource({"2, 1",
				"3, 1",
				"5, 1",
				})
	
	void testTransformar(int entrada, int esperado) {
		
		//Arrange: 
		Ejercicio1 ejercicio1 = new Ejercicio1();
		//Act: 
		int resultadoReal = ejercicio1.transformar(entrada);
		//Assert: 
		assertEquals(resultadoReal, esperado); 
		
		}
	
	
	
	
	
	
	
	
	
	
	

}
