package controle;


public class For3 {
	
	public static void main(String[] args) {
		
//		int i = 0; // variável global
//		
//		for(; i < 10; i++) { // se definir a variavel aqui, ela se torna local
//			System.out.println(i);
//		}
//		
//		System.out.println("Saiu do laço for...");
//		System.out.println(i);
		
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				System.out.printf("[%d %d]", i, j);
			}
			System.out.println();
		}
		
	}

}
