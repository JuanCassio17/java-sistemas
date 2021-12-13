package operadores;

public class Logicos {
	
	public static void main(String[] args) {
		
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		
		System.out.println(condicao1 && condicao2); // operador e
		System.out.println(condicao1 || condicao2); // operador ou
		System.out.println(condicao1 ^ condicao2);  // operador ouE
		System.out.println(condicao1 != condicao2); // operador negação
		
		// Tabela Verdade E:
		System.out.println("\nTabela verdade &&");
		System.out.println(true && true);
		System.out.println(true && false);
		/* primeira condição sendo falsa
		o retorno sempre será falso.*/
		System.out.println(false && true);
		System.out.println(false && false);
		
		// Tabela Verdade OU:
		System.out.println("\nTabela verdade ||");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		// Tabela Verdade XOR:
		System.out.println("\nTabela verdade ^");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		// Tabela Verdade NEGAÇÃO:
		// lembrando que é operador unário
		System.out.println("\nTabela verdade !");
		System.out.println(true != true);
		System.out.println(true != false);
		System.out.println(false != true);
		System.out.println(false != false);

	}

}
