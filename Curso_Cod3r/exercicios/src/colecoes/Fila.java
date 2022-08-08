package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String >();
		
		// offer e add adicionam elementos na fila
		// a diferença é o comportamento quando a fila está cheia
		// add -> retorna false
		// offer -> lança uma exceção
		
		fila.add("Ana");
		fila.offer("Bia");
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		// peek e element obter os elementos da fila sem remover
		// a diferença é o comportamento quando a fila está vazia
		System.out.println(fila.peek()); // retorna null
		System.out.println(fila.element()); // lança uma exceção

		System.out.println(fila.poll()); // retorna null quando está vazia
		System.out.println(fila.remove()); // lança uma exceção quando está vazia
		
		// fila.size();
		// fila.clear();
		// fila.isEmpty();
		// fila.contains();
		
		
		
				
	}

}
