package oo.composicao;

public class CarroTeste {
	
	public static void main(String[] args) {
		
		Carro c = new Carro();
		
		System.out.println(c.estaLigado());
		c.ligar();
		System.out.println(c.estaLigado());
		System.out.println(c.motor.giros());
		c.acelerar();
		c.acelerar();
		c.acelerar();
		c.acelerar();
		System.out.println(c.motor.giros());
		c.frear();
		c.frear();
		c.frear();
		c.frear();
		System.out.println(c.motor.giros());
		
		// Faltou Encapsulamento // private
		// c.motor.fatorInjecao = -30;
		
		// relação bidirecional
		System.out.println(c.motor.carro.motor.carro.motor.carro.motor.giros());
	
	}
	

}
