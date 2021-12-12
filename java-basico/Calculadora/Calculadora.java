import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("--------CALCULADORA SIMPLES--------");
		System.out.println("[1] SOMA === [2] SUBTRAÇÃO === [3] MULTIPLICAÇÃO\n" +
		                   "[4] DIVISÃO === [5] MÉDIA"); 
		System.out.println("Digite uma opção de cálculo: ");
		
		Scanner leitor = new Scanner(System.in); 
		int escolha = leitor.nextInt(); //usuário escolhe a opção

		if (escolha == 1){ //faz soma
		    System.out.println("Digite o 1º número para ser calculado: ");
		    int x = leitor.nextInt();
		    System.out.println("Digite o 2º número para ser calculado: ");
		    int y = leitor.nextInt();
		    int soma = x + y;
		    System.out.printf("A soma entre %d e %d é: %d%n ", x, y, soma);
		
		}else if (escolha == 2){ //faz subtração
		    System.out.println("Digite o 1º número para ser calculado: ");
		    int x = leitor.nextInt();
		    System.out.println("Digite o 2º número para ser calculado: ");
		    int y = leitor.nextInt();
		    int subtracao = x - y;
		    System.out.printf("A subtração entre %d e %d é: %d%n ", x, y, subtracao);
		
		}else if (escolha == 3){ //faz multiplicação
		    System.out.println("Digite o 1º número para ser calculado: ");
		    int x = leitor.nextInt();
		    System.out.println("Digite o 2º número para ser calculado: ");
		    int y = leitor.nextInt();
		    int multiplicacao = x * y;
		    System.out.printf("A multiplicação entre %d e %d é: %d%n ", x, y, multiplicacao);
		
		}else if (escolha == 4) { //faz divisão
		    System.out.println("Digite o 1º número para ser calculado: ");
		    int x = leitor.nextInt();
		    System.out.println("Digite o 2º número para ser calculado: ");
		    int y = leitor.nextInt();
		    int divisao = x / y;
		    System.out.printf("A divisão entre %d e %d é: %d%n ", x, y, divisao);
		
		}else if (escolha == 5){ //faz cálculo de média entre quatro notas
		    System.out.println("Digite a 1ª nota: ");
		    float a = leitor.nextFloat();
		    System.out.println("Digite a 2ª nota: ");
		    float b = leitor.nextFloat();
		    System.out.println("Digite a 3ª nota: ");
		    float c = leitor.nextFloat();
		    System.out.println("Digite a 4ª nota: ");
		    float d = leitor.nextFloat();
		    float media = (a + b + c + d) / 4;
		    System.out.printf("A média entre %.2f, %.2f, %.2f e %.2f é: %.2f%n ", a, b, c, d, media);
		}
	}
}
