package ual.hmis.sesion06.ejercicio3;

public class Ejercicio3 {
	
	
	public String enmascararContraseña(String contraseña) {
		
		//Precondiciones: 
		
		String cadenaSalida = ""; 
		
		if(contraseña.length() < 5) {
			cadenaSalida = "password demasiado corto"; 
		}
		
		else if(contraseña.length() >= 5 && contraseña.length() <= 8) {
			
			cadenaSalida = "********";
		}
		
		else if(contraseña.length() >= 12 && contraseña.length() <= 40) {
			
			cadenaSalida = "************";
		}
		
		else {
			cadenaSalida = "password demasiado largo"; 	
		}
		
		
		
		return cadenaSalida; 
		
	}
	
	

}
