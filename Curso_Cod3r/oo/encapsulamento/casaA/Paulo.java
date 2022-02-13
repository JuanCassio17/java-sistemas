package oo.encapsulamento.casaA;

public class Paulo {
	
	void testeAcessos() {
		Ana esposa = new Ana();
		// System.out.println(esposa.segredo); -> não consegue porque é private
		System.out.println(esposa.facoDentroDeCasa); // é default, mesmo pacote
		System.out.println(esposa.formaDeFalar); // não é de herança, mas é do mesmo pacote
		System.out.println(esposa.todosSabem); // é público
		
	}
		
}
