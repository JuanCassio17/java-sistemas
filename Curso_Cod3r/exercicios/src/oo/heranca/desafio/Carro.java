package oo.heranca.desafio;

public class Carro {
	
	int velocidadeAtual = 0;
	
	
	int acelerar(int acelerador) {
		return velocidadeAtual += acelerador;
	}
	
	int acelerar() {
		return velocidadeAtual += 5;
	}
	
	int frear(int freio) {
		
		if(velocidadeAtual < 0) {
			return velocidadeAtual = 0;
		}else {
			return velocidadeAtual -= freio;
		}
	}
	
	int frear() {
		
		if(velocidadeAtual < 0) {
			return velocidadeAtual = 0;
		}else {
			return velocidadeAtual -= velocidadeAtual;
		}
	}

}
