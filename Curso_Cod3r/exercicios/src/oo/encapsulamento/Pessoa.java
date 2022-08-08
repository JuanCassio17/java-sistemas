package oo.encapsulamento;

public class Pessoa {
	
	private int idade;
	private String nome;
	private String sobrenome;
	
	public Pessoa(String nome, String sobrenome, int idade) { 
		setIdade(idade);
		setSobrenome(sobrenome);
		setNome(nome);
		
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	// Getter
	public int getIdade() { // método get
		return idade;
	}
	
	// Setter
	public void setIdade(int novaIdade) { // método set
		novaIdade = Math.abs(novaIdade);
		if (novaIdade >= 0 && novaIdade <= 120) {
			this.idade = novaIdade;	
		}
		
	}

	public String getSobrenome() {
		return sobrenome;
	}
	
	public String getNomeCompleto() {
		return getNome() + " " + getSobrenome();
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String toString() {
		return "Olá, me chamo " + getNomeCompleto() +
				" e tenho " + getIdade() + " anos."; 
	}

}
