package classe;

public class DataTeste {
	
	public static void main(String[] args) {
		
		Data d1 = new Data();
		d1.dia = 7;
		d1.mes = 11;
		d1.ano = 2021;
		
		var d2 = new Data();
		d2.dia = 31;
		d2.mes = 12;
		d2.ano = 2020;
		
		Data d3 = new Data();
		d3.dia = 10;
		d3.mes = 8;
		d3.ano = 2014;
		
		Data d4 = new Data();
		d4.dia = 11;
		d4.mes = 9;
		d4.ano = 2015;
		
		Data d5 = new Data();
		System.out.println(d5.obterDataFormatada());
		
		Data d6 = new Data(12, 5, 2010);
		System.out.println(d6.obterDataFormatada());
		
		System.out.printf("%d/%d/%d\n", d1.dia, d1.mes, d1.ano);
		System.out.printf("%d/%d/%d\n", d2.dia, d2.mes, d2.ano);
		System.out.println(d3.obterDataFormatada());
		d4.imprimirDataFormatada();
	
	}

}
