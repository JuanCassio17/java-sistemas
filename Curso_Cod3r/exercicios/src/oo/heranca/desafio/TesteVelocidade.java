package oo.heranca.desafio;

public class TesteVelocidade {
	
	public static void main(String[] args) {
		
		Carro carro1 = new Carro();
		
		carro1.acelerar(); // Carro (Classe Mãe) -> acelera em 5
		carro1.acelerar(10);
		
		System.out.println(carro1.velocidadeAtual);
		carro1.frear();
		System.out.println(carro1.velocidadeAtual);
		carro1.frear(10);
		carro1.frear();
		System.out.println(carro1.velocidadeAtual);
		
		Fox fox1 = new Fox(); // Fox (Classe Filha) -> acelera em 10
		fox1.acelerar();
		System.out.println(fox1.velocidadeAtual);
		
		Fusca fusca1 = new Fusca(); // Fusca (Classe Filha) -> acelera em 3
		fusca1.acelerar();
		System.out.println(fusca1.velocidadeAtual);
	}

}
