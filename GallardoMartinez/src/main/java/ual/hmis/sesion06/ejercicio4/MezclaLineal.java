package ual.hmis.sesion06.ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class MezclaLineal {
	
	public  <T extends Comparable<T>> List<T> mezcla(List<T> l1, List<T> l2){
		List<T> x = new ArrayList<T>();
		boolean pr=true ,seg=true;
		int primero=0 , segundo = 0;
		T first=null, second=null;
		if(l1.isEmpty()) pr=false;
		else first = l1.get(0);
		if(l2.isEmpty()) seg=false;
		else second=l2.get(0);
		while(pr&&seg) {
			int comparacion = first.compareTo(second);
			if(comparacion>0) {
				x.add(second);
				if(!(l2.size()==++segundo))
					second= l2.get(segundo);
				else
					seg=false;
			}
			else if(comparacion<0) {
				x.add(first);
				if(!(l1.size()==++primero))
					first = l1.get(primero);
				else
					pr=false;
			}
			else {
				x.add(first);
				
				if(!(l1.size()==++primero))
					first = l1.get(primero);
				else
					pr=false;
				
				if(!(l2.size()==++segundo))
					second= l2.get(segundo);
				else
					seg=false;
			}
		}
		if(pr) {
			while(l1.size()>primero) {
				first = l1.get(primero++);
				x.add(first);
			}
		}
		else if(seg) {
			while(l2.size()>segundo) {
				second = l2.get(segundo++);
				x.add(second);
			}
		}
		return x;
	}

}
