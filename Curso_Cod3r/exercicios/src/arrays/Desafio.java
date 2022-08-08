package arrays;

import java.util.Scanner;

public class Desafio {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Quantas notas você deseja calcular? ");
		int qtdeNotas = leitor.nextInt();
		double[] notas = new double[qtdeNotas];	
		System.out.printf("Usuário definiu %s valores para calcular\n", qtdeNotas);
		System.out.println("-------------");

		for(int i = 0; i < notas.length; i++) {
			System.out.printf("Informe a nota %s: ", (i + 1));
			notas[i] = leitor.nextDouble();	
		}
		
//		double total = 0; 
//		for (double nota : notas) { // não consegui com for each
//			  total += notas;
//		}
		
		double total = 0; 
		for (int i = 0; i < notas.length; i++) {
			total += notas[i];
		}
		
		double media = total/notas.length;
		
		System.out.printf("A média é %s.", media);
		
		leitor.close();
	}
	
}

