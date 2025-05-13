package ual.hmis.sesion06.ejercicio3;

public class Ejercicio3 {
	
	
	public String enmascararContraseña(String contraseña) {
		
		//Precondiciones: 
		
		String cadenaSalida = ""; 
		
		if(contraseña.length() < 5) {
			cadenaSalida = "password demasiado corto"; 
		}
		
		//En este caso se puede notar que aparece en amarillo (no se cubren todas las ramas) pero
		//se justifica ya que si llega a este punto contraseña.length >= 5
		else if(contraseña.length() >= 5 && contraseña.length() <= 8) {
			
			cadenaSalida = "********";
		}
		
		
		
		else if(contraseña.length() >= 12 && contraseña.length() <= 40) {
			
			cadenaSalida = "************";
		}
		
		else if(contraseña.length() > 40){
			cadenaSalida = "password demasiado largo"; 	
		}
		
		else {
			
			cadenaSalida = "password no valido"; 
		}
		
		
		
		return cadenaSalida; 
		
	}
	
	

}
