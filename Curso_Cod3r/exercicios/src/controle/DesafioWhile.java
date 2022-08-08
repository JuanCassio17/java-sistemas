package controle;

import java.util.Scanner;

public class DesafioWhile {
	
	public static void main(String[] args) {
		
//		int notasValidas = 0;
//		float notaUsuario = 0;
//		float notaTurma = 0;
//		float mediaTotal;
//
//		Scanner leitor = new Scanner(System.in);anco d
//
//			
//		while (notaUsuario >= 0) {
//			
//			System.out.print("Digite a nota do aluno: [0] sair ");
//			notaUsuario = leitor.nextFloat();
//			System.out.println("Nota adicionada com sucesso");
//			System.out.println("-----------------------------");
//			notasValidas++;
//			notaTurma += notaUsuario;
//			
//			if (notaUsuario <= 0) {
//				notasValidas--;
//				System.out.println("Nota inválida. Você saiu!");
//				break;
//			}
//			
//		}
//		
//		System.out.println("---RESULTADO---");
//		mediaTotal = notaTurma/notasValidas;
//		System.out.printf("Foi contabilizado %s", notasValidas);
//		System.out.printf("\nTotal calculado: %.2f\n", notaTurma);
//		System.out.printf("A média da turma é: %.2f", mediaTotal);
//
//		leitor.close();
		
		// resolução professor
		
		Scanner entrada = new Scanner(System.in);

		int quantidadeDeNotas = 0;
		double nota = 0;
		double total = 0;
		
		while(nota != -1) {
			System.out.print("Informe a nota (ou -1 p/ sair): ");
			nota = entrada.nextDouble();
			
			if(nota <= 10 && nota >= 0) {
				total += nota;
				quantidadeDeNotas++;
			} else if(nota != -1) {
				System.out.println("Nota inválida!");
			}
			
			
			
		}
		
		// calcular a média
		double media = total / quantidadeDeNotas;
		System.out.println("Média = " + media);

		entrada.close();
		
	}

}
