package ual.hmis.sesion06.ejercicio5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.TreeSet;

public class ContadorDePalabras {

    public List<String> leerPalabras(String archivo) throws IOException {

        // Cargar el archivo desde src/main/resources
        InputStream is = getClass().getClassLoader().getResourceAsStream(archivo);
        List<String> palabras = new ArrayList<>();
        if (is == null) {
           return palabras;
        }


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
    
    public List<String> OrdenPalabrasRepetidas(String archivo) throws IOException {

        // Cargar el archivo desde src/main/resources
        InputStream is = getClass().getClassLoader().getResourceAsStream(archivo);
        List<String> palabras = new ArrayList<>();
        if (is == null) {
            return palabras;
        }

        

        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String linea;
        TreeMap<Integer,TreeSet<String>> arbol = new TreeMap<>();

        while ((linea = br.readLine()) != null) {
            String[] palabrasEnLinea = linea.split("\\s+");

            for (int i = 0; i < palabrasEnLinea.length; i++) {
                if (!palabrasEnLinea[i].isEmpty()) {
                	boolean found =false;
                    String palabra= (palabrasEnLinea[i].toLowerCase());
                    int aux=1;
                    for(Entry<Integer,TreeSet<String>> par: arbol.entrySet()) {
                    	if(!par.getValue().contains(palabra)) continue;
                    	found=true;
                    	aux = par.getKey()+1;
                    	par.getValue().remove(palabra);
                    	break;
                    }
                    TreeSet<String> arbolaux = arbol.get(aux);
                	if(arbolaux==null) arbolaux = new TreeSet<String>();
                	arbolaux.add(palabra);
                	arbol.put(aux, arbolaux);
                    
                }
            }
        }

        br.close();
        
        for(TreeSet<String> words : arbol.values()) {
        	for(String word : words) {
        		palabras.add(word);
        	}
        }
        return palabras;
    }
     
    
}

	
	

