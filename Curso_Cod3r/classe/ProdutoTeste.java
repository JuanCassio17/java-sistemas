package classe;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		
		Produto p = new Produto();
		
		p.nome = "Cuscuz";
		p.preco = 2.50;
		p.desconto = 0.1;
		
		Produto p1 = new Produto();
		p1.nome = "Feijão";
		p1.preco = 8.30;
		p1.desconto = 0.5;
		
		System.out.println(p.nome);
		System.out.println(p1.nome);
		
		System.out.println(p.preco + p1.preco);
		
		double desconto1 = p.precoComDesconto();
		System.out.println(desconto1);
		
		
		
	}

}
