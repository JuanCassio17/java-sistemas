package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);

		System.out.print("Quantos alunos? ");
		int qntdAlunos = leitor.nextInt();
		
		System.out.print("Quantas notas por aluno? ");
		int qntdNotas = leitor.nextInt();
		
		double[][] notasDaTurma = new double[qntdAlunos][qntdNotas];
		
		double total = 0;
		
		for (int a = 0; a < notasDaTurma.length; a++) {
			for (int n = 0; n < notasDaTurma[a].length; n++) {
				System.out.printf("Informe a nota %d do aluno %d: ", n+1,a+1);
				notasDaTurma[a][n] = leitor.nextDouble();
				total += notasDaTurma[a][n];
			}
			
		}
		
		double media = total / (qntdAlunos * qntdNotas);
		System.out.println(media);
		
		for(double[] notasDoAluno : notasDaTurma) {
			System.out.println(Arrays.toString(notasDoAluno));
			
		}
		
		leitor.close();
		
	}

}
