package operadores;

public class Relacionais {
	
	public static void main(String[] args) {
		
		int a = 97;
		int b = 97;
		
		System.out.println(a == b); // comparação igualdade binário
		System.out.println(3 <= 4);
		System.out.println(3 >= 4);
		System.out.println(3 <= 3);
		System.out.println(4 >= 4);
		System.out.println(3 != 3);
	
		double nota = 7.3;
		boolean bomComportamento = true;
		boolean passouMedia = nota >= 7;
		
		boolean temDesconto = bomComportamento && passouMedia;
		
		System.out.println("Tem desconto ? " + temDesconto);
	}

}
