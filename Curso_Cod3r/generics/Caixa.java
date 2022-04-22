package generics;

public class Caixa<TIPO> {
	
	/*
	 *  o mais comum é definir com apenas uma letra
	 *  Exemplo: public class Caixa<T> {...}
	 */

	private TIPO coisa;
	
	public void guardar(TIPO coisa) {
		this.coisa = coisa;	
	}
	
	public TIPO abrir() {
		return coisa;
	}
	

}
