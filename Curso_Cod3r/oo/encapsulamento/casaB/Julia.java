package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Julia {
	
	void testeAcessos() {
		Ana sogra = new Ana();
		// System.out.println(esposa.segredo); -> não consegue porque é private
		//System.out.println(sogra.facoDentroDeCasa);
		//System.out.println(sogra.formaDeFalar); 
		System.out.println(sogra.todosSabem); // é público
		
	}
	

}
