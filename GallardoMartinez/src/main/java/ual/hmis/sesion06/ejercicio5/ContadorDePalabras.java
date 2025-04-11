package ual.hmis.sesion06.ejercicio5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ContadorDePalabras {

    public List<String> leerPalabras() throws IOException {

        // Cargar el archivo desde src/main/resources
        InputStream is = getClass().getClassLoader().getResourceAsStream("textoEjemplo.txt");
        if (is == null) {
            throw new IOException("No se encontró el archivo textoEjemplo.txt en src/main/resources");
        }

        List<String> palabras = new ArrayList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String linea;

        while ((linea = br.readLine()) != null) {
            String[] palabrasEnLinea = linea.split("\\s+");

            for (int i = 0; i < palabrasEnLinea.length; i++) {
                if (!palabrasEnLinea[i].isEmpty()) {
                    palabras.add(palabrasEnLinea[i].toLowerCase());
                }
            }
        }

        br.close();
        
        
        palabras.sort(null);

        return palabras;
    }
     
    
}

	
	

