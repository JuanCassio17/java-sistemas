package classe;

public class Data {
	
	int dia, mes, ano;
	
	String obterDataFormatada(){

		String dataFormatada = String.format("%d/%d/%d", dia, 
				mes, ano);
		return dataFormatada;
	}
	
	void imprimirDataFormatada(){
		System.out.println(obterDataFormatada());
	}

}
