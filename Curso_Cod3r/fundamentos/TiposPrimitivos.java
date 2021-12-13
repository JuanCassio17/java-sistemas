package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		// Informações do funcionário
		
		// Tipos Numéricos
		byte anosEmpresa = 23;
		short numerodeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_324_845_223L;
		
		// Tipos numéricos reais
		float salario = 11_445.44f;
		double vendasAcumuladas = 2_546_544_103.01D;
		
		// Tipo booleano
		boolean estaDeFerias = false; // true
		
		// Tipo caractere
		char status = 'A'; // ativo, por exemplo
	
		// Dias de empresa
		System.out.println(anosEmpresa * 365);
		
		// Números de viagens
		System.out.println(numerodeVoos	/ 2);

		// Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println("O id " + id + " ganha " + salario);
		
		System.out.println("Férias " + estaDeFerias);
		
		System.out.println("Status " + status);
		
	}
		
}
