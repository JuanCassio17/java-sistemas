package fundamentos;

import java.util.Scanner;

public class Console {
	
	public static void main(String[] args) {
		
		String nome;
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		nome = leitor.nextLine();
		
		// Exercício mega sena
		
		int numero1;
		int numero2;
		int numero3;
		int numero4;
		int numero5;
		int numero6;
		
		System.out.print("Digite o primeiro número: ");
		numero1 = leitor.nextInt();
		System.out.print("Digite o segundo número: ");
		numero2 = leitor.nextInt();
		System.out.print("Digite o terceiro número: ");
		numero3 = leitor.nextInt();
		System.out.print("Digite o quarto número: ");
		numero4 = leitor.nextInt();
		System.out.print("Digite o quinto número: ");
		numero5 = leitor.nextInt();
		System.out.print("Digite o sexto número: ");
		numero6 = leitor.nextInt();
		
		System.out.printf("O usuário %s apostou nos números: \n\n", nome);
	
		System.out.printf("1º número apostado: %d\n2º número apostado: %d\n" +
				"3º número apostado: %d\n4º número apostado: %d\n5º número apostado: %d\n"+
				"6º número apostado: %d", numero1, numero2, numero3, numero4, numero5, numero6);
		
		// fecha o objeto da classe Scanner, evita consumo de memória - IDE para de reclamar
		leitor.close(); 

	}
	
}
