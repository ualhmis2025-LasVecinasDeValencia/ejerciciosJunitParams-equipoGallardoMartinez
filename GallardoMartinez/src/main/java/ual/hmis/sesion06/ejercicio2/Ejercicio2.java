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
		
		return compruebaLoginEnBD(username, password);
		
		}

	
		public boolean compruebaLoginEnBD
		(String username, String password){
		// método mock (simulado)
		if (username.equals("user") && password.equals("pass"))
		return true;
		else
		return false;
		}
	
	
	
	
	
	

}
