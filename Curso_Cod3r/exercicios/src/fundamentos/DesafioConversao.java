package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		
		
		Scanner leitor = new Scanner(System.in);
		
		String salarioMes1;
		String salarioMes2;
		String salarioMes3;
		
		float salarioTotal;
		
		System.out.println("Digite o primeiro salário do funcionário: ");
		salarioMes1 = leitor.nextLine();
		System.out.println("Digite o segundo salário do funcionário: ");
		salarioMes2 = leitor.nextLine();
		System.out.println("Digite o terceiro salário do funcionário: ");
		salarioMes3 = leitor.nextLine();
		
		// convertendo String para Float (Wrapper)
		Float conversao1 = Float.parseFloat(salarioMes1);
		Float conversao2 = Float.parseFloat(salarioMes2);
		Float conversao3 = Float.parseFloat(salarioMes3);
		
		salarioTotal = (conversao1 + conversao2 + conversao3) / 3;
		
		System.out.printf("A média salarial do funcionário é: R$ %.2f"
				, salarioTotal);
		
		leitor.close();
	
	}

}
