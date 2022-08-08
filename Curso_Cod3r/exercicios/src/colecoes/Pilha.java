package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	
	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<String>();
		
		livros.add("O Pequeno Princípe");
		livros.push("Don Quixote");
		livros.push("O Hobbit");
		
		// System.out.println(livros.peek()); // ou livros.element()
		
		System.out.println(livros.poll()); // remove O Hobbit
		System.out.println(livros.poll()); // remove Don Quixote
		System.out.println(livros.poll()); // remove O Pequeno Princípe
		System.out.println(livros.poll()); // retorna null
		// System.out.println(livros.remove()); // retorna um tratamento de exceção
		// System.out.println(livros.pop()); // retorna um tratamento de exceção
		
		// livros.size(); tamanho
		// livros.clear(); limpar
		// livros.contains(); contém ou não
		// livros.isEmpty(); verifica se está vazia
		
//		for (String livro : livros) {
//			System.out.println();
//			
//		}
		
	}

}
