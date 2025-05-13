package ual.hmis.sesion06.ejercicio2;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import ual.hmis.sesion06.ejercicio1.Ejercicio1;

public class Ejercicio2Test {
	

	//Arrange
	@ParameterizedTest
	@CsvSource({"'', contraseña, false",
				"nombreUsuario, contraseña, false",
				"user, pass, false",
				"usuario, '', false",
				"'', '', false", 
				"usuariodemasiadolargoquetienem, contraseñanormal, false",
				"usuarionormal, usuariodemasiadolargoquetienem, false",
				"usuario, contraseña, false",
				"user, contraseña, false",
				"usuario, pass, false",
				"usuario, contrasenasinmayusculas, false",
				"usuario, contraseñaSinDigitos, false",
				"usuario, CONTRASENASINMINUSCULAS, false",
				"usuario, Contrasena12, true", 
				"usuario, @@@@@@@@@@@, false",
				"user, Contrasena12, false",
				"usuario, Contrasena1, false"
				})
	
	void testLogin(String nombreUsuario, String constraseña, Boolean resultado) {
		
		//Arrange: 
		Ejercicio2 ejercicio2 = new Ejercicio2();
		//Act: 
		Boolean resultadoReal = ejercicio2.login(nombreUsuario, constraseña); 
		//Assert: 
		
		assertEquals(resultado, resultadoReal); 

		}
	
	
	
	
	

}
