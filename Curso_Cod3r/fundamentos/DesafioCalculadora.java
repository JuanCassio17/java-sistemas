package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	
	public static void main(String[] args) {
		
		// Tentativa do desafio COM condições
		
//		String operacao = JOptionPane.showInputDialog("Digite o simbolo "
//				+ "da operação que deseja: + - * / % ");
//		String num1 = JOptionPane.showInputDialog("Digite o 1º valor: ");
//		String num2 = JOptionPane.showInputDialog("Digite o 2º valor: ");
//		
//		Integer valor1 = Integer.parseInt(num1);
//		Integer valor2 = Integer.parseInt(num2);
//	
//		int soma = valor1 + valor2;
//		int subtracao = valor1 - valor2;
//		int multiplicacao = valor1 * valor2;
//		int divisao = valor1 / valor2;
//		int modulo = valor1 % valor2;
//		
//		if(operacao.equals("+")) {
//			System.out.printf("A soma de %s + %s é: %s", valor1, valor2, soma);
//		}else if(operacao.equals("-")){
//			System.out.printf("A subtração de %s - %s é: %s", valor1, valor2, subtracao);
//		}else if(operacao.equals("*")){
//			System.out.printf("A multiplicação de %s * %s é: %s", valor1, valor2, multiplicacao);
//		}else if(operacao.equals("/")){
//			System.out.printf("A divisao de %s / %s é: %s", valor1, valor2, divisao);
//		}else if(operacao.equals("%")){
//			System.out.printf("O módulo de %s % %s é: %s", valor1, valor2, modulo);
//		}else {
//			System.out.println("Entrada incorreta");
//		}
		
		// Tentativa do desafio SEM condições
		
//		Scanner leitor = new Scanner(System.in);
//		System.out.println("Digite o simbolo "
//					+ "da operação que deseja: + - * / % ");
//		String operacao = leitor.nextLine();
//		
//		System.out.println("Digite o 1º valor: ");
//		int num1 = leitor.nextInt();
//		System.out.println("Digite o 2º valor: ");
//		int num2 = leitor.nextInt();
//		
//		int soma = num1 + num2;
//		int subtracao = num1 - num2;
//		int multiplicacao = num1 * num2;
//		int divisao = num1 / num2;
//		int modulo = num1 % num2;
//		
//		String stringSoma = String.format("A soma de %s + %s é: %s", num1, num2, soma);
//		String stringSub = String.format("A subtração de %s - %s é: %s", num1, num2, subtracao);
//		String stringMult = String.format("A multiplicação de %s * %s é: %s", num1, num2, multiplicacao);
//		String stringDiv = String.format("A divisao de %s / %s é: %s", num1, num2, divisao);
//		String stringMod = String.format("O módulo de %s % %s é: %s", num1, num2, modulo);
//		
//		String resultadoSoma = operacao.equals("+") ? stringSoma : stringSoma;
//		String resultadoSub panda= operacao.equals("-") ? stringSub : stringSub;
//		String resultadoMult = operacao.equals("*") ? stringMult : stringMult;
//		String resultadoDiv = operacao.equals("/") ? stringDiv : stringDiv;
//		String resultadoMod = operacao.equals("%") ? stringMod : stringMod;
//		
//		leitor.close();
		
		// Correção com professor
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o número: ");
		double num1 = entrada.nextDouble();
		System.out.println("Informe o número: ");
		double num2 = entrada.nextDouble();
		
		System.out.println("Informe a operação: ");
		String op = entrada.next();
		
		// Lógica
		
		double resultado = "+".equals(op) ? num1 + num2 : 0;
		resultado = "-".equals(op) ? num1 - num2 : resultado;
		resultado = "*".equals(op) ? num1 * num2 : resultado;
		resultado = "/".equals(op) ? num1 / num2 : resultado;
		resultado = "%".equals(op) ? num1 % num2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f", num1, op, num2, resultado);
		entrada.close();
		
		
	}

}
