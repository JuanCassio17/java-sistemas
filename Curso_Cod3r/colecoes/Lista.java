package colecoes;

import java.util.ArrayList;

public class Lista {
	
	public static void main(String[] args) {
		
		ArrayList<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Ana");
		lista.add(u1);
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));
		
		System.out.println(lista.get(3)); // acessa pelo índice
		
//		for (Usuario u : lista) {
//			System.out.println(u);
//			
//		}
		
		lista.remove(1); // remove por índice
		lista.remove(new Usuario("Manu")); // remove por nome do objeto
		
		
	}

}
