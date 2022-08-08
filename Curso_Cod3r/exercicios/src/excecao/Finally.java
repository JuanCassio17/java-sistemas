package excecao;

import java.util.Scanner;

public class Finally {
	
	public static void main(String[] args) {
		
		System.out.println("Digite um número: ");
		Scanner leitor = new Scanner(System.in);
		
		try {
			System.out.println(7 / leitor.nextInt());
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		} finally {
			System.out.println("Finalmente #01...");
		}
		
		try {
			System.out.println(7 / leitor.nextInt());
			
		} finally {
			System.out.println("Finalmente #02...");
			leitor.close();
		}
		
		System.out.println("fim");
		
	}

}
