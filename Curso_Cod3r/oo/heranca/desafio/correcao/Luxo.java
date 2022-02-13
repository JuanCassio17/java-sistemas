package oo.heranca.desafio.correcao;

public interface Luxo {
	
	public void ligarAr();
	abstract void desligarAr();
	default int velocidadeDoAr() {
		return 1;
	}

}
