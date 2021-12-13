package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		
		// System.out.println("Olá, Mundo!".charAt(2));
		
		String s = "Boa tarde";
		
		// retorna valor booleano
		System.out.println(s.startsWith("Boa tarde"));
		System.out.println(s.endsWith("tarde"));
		
		System.out.println(s.equals("boa tarde")); 
		// false porque considera maiusculas e minusculas
		System.out.println(s.equalsIgnoreCase("boa tarde")); 
		// true porque ignora maiusculas e minusculas
		
		// também posso acessar os métodos utizando var
		var nome = "Ednaldo";
		
		System.out.println(nome.toUpperCase());
		
		// formatado %s = strings %d = inteiros %f = flutuantes
		int idade = 22;
		float salario = 2_200;
		System.out.printf("Funcionário: %s\nIdade: %d\nSalario: %.2f", nome, idade, salario);
		
	}

}
