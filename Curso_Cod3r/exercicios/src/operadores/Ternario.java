package operadores;

import java.util.Scanner;

public class Ternario {
	
	public static void main(String[] args) {
		
		double media = 5.6;
		String resultadoParcial = media >= 5.0 ? "Recuperação" : "Reprovado";
		String resultadoFinal = media >= 7.0 ? "Aprovado" : resultadoParcial;
		System.out.printf("O aluno está %s\n", resultadoFinal);
		
		System.out.println("Digite um número");
		Scanner leitor = new Scanner(System.in);
		int num = leitor.nextInt();
		String verifica = num % 2 == 0 ? "é par" : "é ímpar";
		System.out.println(verifica);
		
	}

}
