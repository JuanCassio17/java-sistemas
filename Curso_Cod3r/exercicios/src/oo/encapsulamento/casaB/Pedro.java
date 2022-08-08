package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;
//ana está em outro pacote, por isso é necessário fazer o import

public class Pedro extends Ana {
		
	void testeAcessos() {
		Ana mae = new Ana();
		Pedro filho = new Pedro();
		// System.out.println(esposa.segredo); -> não consegue porque é private
		// System.out.println(mae.facoDentroDeCasa); -> não consegue porque é outro pacote
		// System.out.println(mae.formaDeFalar); -> não é possível acessar a partir de uma instância
		filho.formaDeFalar = "rápido"; // apenas pela instância da própria classe
		System.out.println(mae.todosSabem); // é público
		System.out.println(filho.todosSabem);
		
	}
	

}
