package excecao;

public class Basico {
	
	public static void main(String[] args) {
		
		Aluno a1 = null;
		
		try {
			imprimirNomeAluno(a1);
			
		} catch (Exception excecao) {
			// TODO: handle exception
			System.out.println("Ocorreu um erro "
					+ "no momento de imprimir o nome do usuário " + excecao);
		}
		
		try {
			System.out.println(7 / 0);
		
		} catch (ArithmeticException e) {
			System.out.println("ocorreu o erro: " + e.getMessage());
		}
		
		System.out.println("fim");
		
	}
	
	public static void imprimirNomeAluno(Aluno aluno) {
		
		System.out.println(aluno.nome);
		
	}

}
