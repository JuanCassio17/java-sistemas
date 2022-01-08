package controle;

import java.util.Scanner;

public class DoWhile {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		String texto = "";
		
		do {
			System.out.println("Você precisa falar "
					+ "as palavras mágicas:\nQuer sair? ");
			texto = leitor.nextLine();
		} while(!texto.equalsIgnoreCase("por favor"));
		
		System.out.println("Volte sempre!");
		leitor.close();
		
	}

}
