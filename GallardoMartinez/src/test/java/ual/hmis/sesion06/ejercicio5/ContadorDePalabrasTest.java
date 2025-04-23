package ual.hmis.sesion06.ejercicio5;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import ual.hmis.sesion06.ejercicio3.Ejercicio3;

public class ContadorDePalabrasTest {
	
	
	
	
	@ParameterizedTest
	@CsvSource( {
		"textoEjemplo.txt,'[12345678, abrigarse,, aerolitos, automovil,, bicicleta, computadora, corre., destacan, dinamismo., ejemplos, ejercicios, el, electricidad, entregaron, es, estudiantes, inteligencia,, longitud., los, matemáticas, más., no, número,, palabra., palabras, pero, perro, por, programador,, puntualmente., que, soluciones,, son, son, su, sus, un, una, y, y, y]'",
		"UnSuspiroAcompasado.txt, '[a, a, a, a, a, abierta, abierta, acaba, acaba, aire, aire, aire, aire, aire, alas, apego, apego., aquí, aquí, aquí, aunque, baila,, batido, batió, brisa, busquen,, caliente., caliente., cambia, cambia, canción, comencé, comencé, comerte, con, con, con, conexiones, contenido, contigo, contigo., cosas., cuente, cuente, cuente, cuente, da, de, de, de, de, de, de, de, de, de, de, de, dejar, dejar, deseo, deseo, dicho, digan, dos., el, el, el, el, el, el, el, el, el, el, el, el, ella, ella, ellas, en, en, en, en, en, encuentro, encuentro, encuentro, escalón,, esencia, espero, espero, espero., estar, estar, esté,, flores, gira,, gira,, ha, habla, habla,, hasta, hasta, hay, he, he, horas., indicio, indicio, juicio, juicio, la, la, la, la, la, la, la, la, las, las, las, le, le, le, le, llega, llega, llega, llega, mariposa, me, me, me, me, me, mecido, mecido, mis, mis, más, más, más, más, no, nosotros, notado, noticias, noticias, noticias, noticias, noto, noto, noto, ocultas, olores, oye, para, para, para, paradero, paradero, pasajera, pedido, pierdo, pierdo, por, por, porque, porque, puerta, puerta, que, que, que, que, que, que, que, que, que, que, que, que, que, que, que,, quiero, quisiera, quédate, razones, recién, recupero, recupero, respira, respiración;, respirarlo, respirarlo, respirarlo, respirarlo, ruge, ruido, saben, sabor, saborear, se, se, sentido, sentido, si, si, si, si, si, si, siempre, siempre, silencio, sol,, soñadoras,, su, su, su, su, sueñan, sueño, suspiro,, suspiro,, tal, tengo, todas, todo, todo, tripas, tu, tu, tus, tus, tus, tus, un, un, un, un, un, una, una, una, urgentes, urgentes, urgentes, urgentes, va, va, ver, ver, ver, vez, vida, vida, viento, viento, voz, vuelva, y, y, y, y, y, y, y, y, y, y, y, y, y, y, y, y, y, ya, yo, yo, yo, último]'",
		"Dere.txt,[]"
		
	})
	
	
	
	void leerPalabrasTest(String rutaArchivo, String cadenaDeSalida) throws IOException {
		
		//Arrange: 
		ContadorDePalabras ejercicio5 = new ContadorDePalabras(); 
		String result;
		result = ejercicio5.leerPalabras(rutaArchivo).toString();
		//Act
		assertEquals(cadenaDeSalida,result);
		
	}
	
	@ParameterizedTest
	@CsvSource( {
		"textoEjemplo.txt, '[12345678, abrigarse,, aerolitos, automovil,, bicicleta, computadora, corre., destacan, dinamismo., ejemplos, ejercicios, el, electricidad, entregaron, es, estudiantes, inteligencia,, longitud., los, matemáticas, más., no, número,, palabra., palabras, pero, perro, por, programador,, puntualmente., que, soluciones,, su, sus, un, una, son, y]'",
		"UnSuspiroAcompasado.txt, '[alas, apego, apego., aunque, baila,, batido, batió, brisa, busquen,, canción, comerte, conexiones, contenido, contigo, contigo., cosas., da, dicho, digan, dos., ellas, escalón,, esencia, espero., esté,, flores, ha, habla, habla,, hay, horas., mariposa, no, nosotros, notado, ocultas, olores, oye, pasajera, pedido, que,, quiero, quisiera, quédate, razones, recién, respira, respiración;, ruge, ruido, saben, sabor, saborear, silencio, sol,, soñadoras,, sueñan, sueño, tal, tengo, todas, tripas, vez, voz, vuelva, ya, último, abierta, acaba, caliente., cambia, comencé, dejar, deseo, ella, espero, estar, gira,, hasta, he, indicio, juicio, mecido, mis, paradero, pierdo, por, porque, puerta, recupero, se, sentido, siempre, suspiro,, todo, tu, va, vida, viento, aquí, con, encuentro, las, noto, para, una, ver, yo, cuente, le, llega, más, noticias, respirarlo, su, tus, urgentes, a, aire, en, me, un, si, la, de, el, que, y]'",
		"Dere.txt,[]"
		
	})
	
	
	
	void OrdenPalabrasRepetidasTest(String rutaArchivo, String cadenaDeSalida) throws IOException {
		
		//Arrange: 
		ContadorDePalabras ejercicio5 = new ContadorDePalabras(); 
		String result;
		result = ejercicio5.OrdenPalabrasRepetidas(rutaArchivo).toString();
		//Act
		assertEquals(cadenaDeSalida,result);
	}
		
		//Assert
		
	
/*
		
		void Contar(String rutaArchivo, String cadenaDeSalida) {
			
			//Arrange: 
			ContadorDePalabras ejercicio = new ContadorDePalabras(); 
			
			//Act
			String cadenaFinal = ejercicio.enmascararContraseña(contraseña); 
			//Assert
			
			assertEquals(cadenaDeSalida, cadenaFinal); 
			
	*/		
	
	
	
	
	
	
	
	
	
	
	


	}
