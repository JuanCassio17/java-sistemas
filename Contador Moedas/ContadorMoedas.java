import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    	// Variáveis
    	float[] valor = {0.05f, 0.10f, 0.25f, 0.50f, 1.00f};
    	float cincox, dezx, vintecincox, cinquentax, realx;
		float nota;
	    float total;

		System.out.println("----- CONTADOR DE MOEDAS -----");
		Scanner leitor = new Scanner(System.in);

		// Input do usuário
		System.out.print("Quantas moedas de 5 centavos? ");
		cincox = leitor.nextFloat();
		System.out.print("Quantas moedas de 10 centavos? ");
		dezx = leitor.nextFloat();
		System.out.print("Quantas moedas de 25 centavos? ");
		vintecincox = leitor.nextFloat();
		System.out.print("Quantas moedas de 50 centavos? ");
		cinquentax = leitor.nextFloat();
		System.out.print("Quantas moedas de 1 real? ");
		realx = leitor.nextFloat();
		System.out.print("Algum valor em nota pra adicionar? ");
		nota = leitor.nextFloat();
		
		// Cálculo total do valor
		total = (cincox * valor[0]) + (dezx * valor[1]) + (vintecincox * valor[2]) +
				(cinquentax * valor[3]) + (realx * valor[4]) + nota;
		
		// Output resultado
		System.out.println("----- RESULTADO -----");
		System.out.printf("Você tem ao todo R$%.2f\n", total);

		// Condicional para trocar por nota de R$ 10,00
		if (total < 10) {
			System.out.println("----- FALTA QUANTO? -----");
			System.out.printf("Falta %.2f para completar R$10,00 reais\n", 10.00f - total);

		}else {
			System.out.println("----- VOCÊ JÁ COMPLETOU! -----");
			System.out.println("Você já pode trocar as moedas por uma nota de R$10,00 reais\n");
		}
    }
}
