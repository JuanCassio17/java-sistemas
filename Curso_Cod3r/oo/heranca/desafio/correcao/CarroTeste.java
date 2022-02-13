package oo.heranca.desafio.correcao;

public class CarroTeste {
	
	public static void main(String[] args) {
		
		Carro c1 = new Civic();
		
		c1.acelerar();
		System.out.println(c1);
		c1.acelerar();
		System.out.println(c1);
		c1.acelerar();
		System.out.println(c1);
		
		Ferrari c2 = new Ferrari(400);
		// Carro c2 = new Ferrari(); -> Também pode instanciar assim
		// Ferrari c3 = new Carro(); -> assim não
	
		c2.acelerar();
		c2.frear();
		System.out.println(c2);
		c2.acelerar();
		c2.ligarTurbo();
		System.out.println(c2);
		c2.acelerar();
		System.out.println(c2);
		
		System.out.println(c2.velocidadeDoAr());
	
	}

}
