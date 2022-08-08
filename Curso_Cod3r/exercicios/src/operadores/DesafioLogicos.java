package operadores;

public class DesafioLogicos {
	
	public static void main(String[] args) {
		
		// Trabalho na terça (V ou F)
		// Trabalho na quinta (V ou F)
		
//		boolean trabalho1 = true;
//		boolean trabalho2 = true;
//		
//		boolean tv32 = true;
//		boolean tv50 = true;
//		
//		boolean sorvete = true;
//		
//		if(trabalho1 && trabalho2 == true) {
//			tv50 = true;
//			sorvete = true;
//			
//		} else if(trabalho1 || trabalho2 == true) {
//			tv32 = true;
//			sorvete = true;
		
//		} else if(trabalho1 ^ trabalho2 == true) {
//		tv50 = false;
//		tv32 = true;	
//		sorvete = true;
		
//		} else {
//			tv50 = false;
//			tv32 = false;
//			sorvete = false;
//		}
		
		boolean trabalho1 = true;
		boolean trabalho2 = true;


		boolean comprouTv50 = trabalho1 && trabalho2;
		boolean comprouTv32 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;
		boolean maisSaudavel = !comprouSorvete; // Operador unário
		
		System.out.println("Comprou tv 50\"? " + comprouTv50);
		System.out.println("Comprou tv 32\"? " + comprouTv32);
		System.out.println("Comprou sorvete ?" + comprouSorvete);
		System.out.println("Mais saudável? " + maisSaudavel);
	}

}
