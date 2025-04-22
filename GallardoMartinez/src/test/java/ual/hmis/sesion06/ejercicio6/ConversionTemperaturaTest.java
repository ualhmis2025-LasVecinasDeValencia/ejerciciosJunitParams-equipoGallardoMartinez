package ual.hmis.sesion06.ejercicio6;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ConversionTemperaturaTest {


	@ParameterizedTest
	@CsvSource({
		
		"0, Celsius, Fahrenheit, 32.0",
		"100, Celsius, Fahrenheit, 212.0",
		"0, Celsius, Kelvin, 273.15",
		"-273.15, Celsius, Kelvin, 0.0",

		
		"32, Fahrenheit, Celsius, 0.0",
		"212, Fahrenheit, Celsius, 100.0",
		"32, Fahrenheit, Kelvin, 273.15",
		"-459.67, Fahrenheit, Kelvin, 0.0",

		
		"273.15, Kelvin, Celsius, 0.0",
		"373.15, Kelvin, Celsius, 100.0",
		"0, Kelvin, Fahrenheit, -459.67",
		"255.37, Kelvin, Fahrenheit, 0.0",
		
		
		"255.37, Antonio, Fahrenheit, NaN",
		"255.37, Kelvin, Kelvin, NaN"
	})
	public void testConvertTemperature(double temperature, String fromUnit, String toUnit, String esp) {
		ConversionTemperatura converter = new ConversionTemperatura();
		double result = converter.convertTemperature(temperature, fromUnit, toUnit);
		double resultEsp;
		
		if(esp=="NaN") {
			resultEsp = Double.NaN;
		}
		else {
			resultEsp = Double.valueOf(esp);
		}

		// Comparación con un margen de error por decimales
		assertEquals(resultEsp, result, 0.01);
	}
}
