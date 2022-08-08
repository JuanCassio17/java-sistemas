package classe;

public class Data {
	
	int dia = 1; 
	int mes; 
	int ano;
	
	String obterDataFormatada(){

		String dataFormatada = String.format("%d/%d/%d", dia, 
				mes, ano);
		return dataFormatada;
	}
	
	void imprimirDataFormatada(){
		System.out.println(obterDataFormatada());
	}
	
	Data(){
//		this.dia = 1;
//		this.mes = 1;
//		this.ano = 1970;
		
		this(1, 1, 1970);
	}
	
	Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
}
