package ual.hmis.sesion06.ejercicio2;

public class Ejercicio2 {
	
	
	public boolean login (String username, String password){
		// comprobar que sean distintos de vacio
		if(username.isEmpty() || password.isEmpty()) {
			
			return false; 
		} 
		
		//Comprobar que ambos sean menores de 30
		if(username.length() >= 30  || password.length() >= 30) {
			
			return false;
			
		}
		
		//El password debe tener al menos una letra mayúscula, una minúscula y un dígito
		
		    boolean tieneMayuscula = false;
	        boolean tieneMinuscula = false;
	        boolean tieneDigito = false;
		
		
		
		 for (char c : password.toCharArray()) {
	            if (Character.isUpperCase(c)) tieneMayuscula = true;
	            else if (Character.isLowerCase(c)) tieneMinuscula = true;
	            else if (Character.isDigit(c)) tieneDigito = true;

	            // Si ya cumple con los tres requisitos, podemos salir del bucle
	            if (tieneMayuscula && tieneMinuscula && tieneDigito) break;
	        }
		 
		 
		 if (!tieneMayuscula || !tieneMinuscula || !tieneDigito) return false;
		 
		 
			return compruebaLoginEnBD(username, password);
			
	}


		public boolean compruebaLoginEnBD
		(String username, String password){
		// método mock (simulado)
		if (username.equals("usuario") && password.equals("Contrasena12")) {
		return true;}
		else {
		return false;
	}
		 
		 
		 
		 
    
		
	}
	

	
	

}
