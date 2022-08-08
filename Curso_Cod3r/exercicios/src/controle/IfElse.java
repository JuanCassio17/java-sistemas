package controle;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class IfElse {
	
	public static void main(String[] args) {
		
		String valor = 	JOptionPane.showInputDialog("Digite o número: ");
		int numero = Integer.parseInt(valor);
		
		if (numero % 2 == 0) {
			System.out.println("é par");
		} else {
			System.out.println("");
		}
		
//		// com operado ternário
//		Scanner leitor = new Scanner(System.in);
//		System.out.println("Digite o valor: ");
//		int numero = leitor.nextInt();
//		boolean verificaPar = numero % 2 == 0 ? true : false;
//		System.out.println(verificaPar);
//		
//		leitor.close();
		
	}

}
