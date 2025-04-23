package ual.hmis.sesion06.ejercicio6;

public class ConversionTemperatura {

	public double convertTemperature(double temperature, String fromUnit, String toUnit) {
		
		switch(fromUnit) {
		case "Celsius":
			switch(toUnit) {
			case "Fahrenheit":
				return (temperature*9/5 +32);
			case "Kelvin":
				return temperature + 273.15;
			}
		case "Fahrenheit":
			switch(toUnit) {
			case "Celsius":
				return (temperature-32)*5/9;
			case "Kelvin":
				return ((temperature -32)*5/9)+273.15;
			}
		case "Kelvin":
			switch(toUnit) {
			case "Celsius":
				return temperature-273.15;
			case "Fahrenheit":
				return ((temperature -273.15)*9/5)+32;
			}
		}
		
		return Double.NaN;
	}
}
