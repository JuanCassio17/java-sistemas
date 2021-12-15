package operadores;

import java.util.Scanner;

public class Atribuicao {
	
	public static void main(String[] args) {
		
		int a = 3;
		int b = a;
		int c = a + b;
		
		c += b; // c = c + b;
		c -= a; // c = c - a;
		c *= b; // c = c * b;
		c /= a; // c = c / a;
		c %= 2; // c = c % 2; 0 ou 1
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int num = leitor.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("é par");
			
		}else {
			System.out.println("é impar");
		}
	
	}

}
