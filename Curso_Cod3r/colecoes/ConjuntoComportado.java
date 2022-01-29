package colecoes;

import java.util.HashSet;
import java.util.Set;
//import java.util.TreeSet;

public class ConjuntoComportado {
	
	public static void main(String[] args) {
		
		Set<String> lista = new HashSet<>();
		//Set<String> lista = new TreeSet<>();
		lista.add("Olá");
		lista.add("Mundo");
		System.out.println(lista);
		
		for (String elemento : lista) {
			System.out.println(elemento);
			
		}
		
	}

}
