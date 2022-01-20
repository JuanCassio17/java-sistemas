package classe;

public class ValorVsReferencia {
	
	public static void main(String[] args) {

		double a = 2;
		double b = a; // atribuição por valor (tipos primitivos)
		
		a++;
		b--;
		
		System.out.println(a + " " + b); // saída será diferente
		
		Data d1 = new Data(1, 6, 2022);
		Data d2 = d1; // atribuição por referência (objetos)
		
		d1.dia = 31;
		d2.mes = 12;
		
		{ // a saída será igual
		System.out.println(d1.obterDataFormatada()); 
		System.out.println(d2.obterDataFormatada());
		}
		
		voltarDataParaValorPadrao(d1);
		
		{ // a saída será igual
			System.out.println(d1.obterDataFormatada()); 
			System.out.println(d2.obterDataFormatada());
		}
		
		int c = 5;
		alterarPrimitivo(c);
		System.out.println(c); // será o mesmo resultado, não há alteração
		}
	
	static void voltarDataParaValorPadrao(Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}
	
	static void alterarPrimitivo(int a) {
		a++;
	}
}



