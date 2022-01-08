package controle;

public class DesafioIf {
	
	public static void main(String[] args) {
		
		double nota = 1.3;
		
		if (nota >= 9.0) /*; <- se adicionar o programa roda */ {
			System.out.println("Quadro de honra");
			System.out.println("Você é fera");
		}
		
		/* Desafio: Olhando para o código acima
		 * você acha que será mostrado o bloco de código? 
		 * 
		 * Resposta: Não. O valor da variável 
		 * nota é menor que 9.0.
		 * */
		
		/* A solução do desafio é apenas o ponto e vírgula.
		 * Um bloco de código {} pode ser definido independente
		 * do método ou condição */
		
	}

}
