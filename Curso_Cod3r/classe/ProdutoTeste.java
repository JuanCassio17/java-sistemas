package classe;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		
		Produto p = new Produto("Cuscuz", 3.50);
		Produto.desconto = 0.29;
		
		//p.nome = "Cuscuz";
		p.preco = 2.50;
		
		Produto p1 = new Produto();
		
		p1.nome = "Feijão";
		p1.preco = 8.30;
		
		System.out.println(p.nome);
		System.out.println(p1.nome);
		
		System.out.println(p.preco + p1.preco);
		
		double desconto1 = p.precoComDesconto();
		System.out.println(desconto1);
		
		Produto produto = new Produto();		
		System.out.println(produto);
		
		
		
	}

}
