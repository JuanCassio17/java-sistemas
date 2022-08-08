package controle;

import java.util.Scanner;

public class WhileIndeterminado {
	
	public static void main(String[] args) {
		
//		Scanner leitor = new Scanner(System.in);
//		System.out.println("Digite aqui uma mensagem: Para sair -> [sair] ");
//		String usuario = leitor.nextLine();
//		System.out.printf("Usuário digitou: %s \n", usuario);
//		
//		while(!usuario.equalsIgnoreCase("sair")) {
//			
//			System.out.println("Digite aqui uma mensagem: Para sair -> [sair] ");
//			usuario = leitor.nextLine();
//			System.out.printf("Usuário digitou: %s \n", usuario);
//			
//		}
//		
//		System.out.printf("Usuário saiu. Até a próxima!");
//		
//		leitor.close();
		
		// código do professor
		Scanner entrada = new Scanner(System.in);
		String valor = "";
		
		while(!valor.equalsIgnoreCase("sair")) {
			System.out.println("Você diz: ");
			valor = entrada.nextLine();
		}
		
		entrada.close();
		
		
	}
}
