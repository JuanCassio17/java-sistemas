package oo.encapsulamento.casaA;

public class Ana {
	
	@SuppressWarnings("unused")
	private String segredo = "..."; // só pode ser acessado dentro dessa classe
	String facoDentroDeCasa = "..."; // default ou pacote
	protected String formaDeFalar = "..."; // transmite por herança
	public String todosSabem = "..."; // qualquer classe acessa

}
