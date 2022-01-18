package classe;

public class Produto {
	
	String nome;
	double preco, desconto;
	
//	double precoDesconto(double preco, double desconto) {
//		
//		double resultado = preco - desconto;
//		return resultado;
//	}
	
	double precoComDesconto() {
		return preco * (1 - desconto);
	}
}
