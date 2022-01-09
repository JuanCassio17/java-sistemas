package controle;

import java.util.Scanner;

public class SwitchComBreak {
	
	public static void main(String[] args) {
		
		
		Scanner leitor = new Scanner(System.in);

		String conceito = "";
		System.out.print("Informe a nota: ");
		int nota = leitor.nextInt();
		
		switch (nota) {
		case 10: case 9:
			conceito = "A";
			break;
		case 8: case 7: { // é possivel ter setença de código dentro dos cases
			conceito = "B";
			break;
		}
		case 6: case 5:
			conceito = "C";
			break;
		case 4: // pode ser definido um abaixo do outro também
		case 3:
			conceito = "D";
			break;
		case 2: case 1: case 0:
			conceito = "E";
			break;
		default: // default não necessariamente está na última posição (mas por padrão sim)
			conceito = "Não informado";
			break; // não é obrigatório ter break no default
		}
		
		System.out.print("Conceito é: " + conceito);
		leitor.close();
		
	}

}
