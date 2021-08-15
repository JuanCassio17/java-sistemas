import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		int tabuada; 
		int multiplicador = 1;
		int resultado = 0;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite aqui a tabuada que deseja: ");
		tabuada = teclado.nextInt();
		
		do {
		    
		    resultado = tabuada * multiplicador;
		    System.out.println(tabuada + " X " + multiplicador + " = " + resultado);
		    multiplicador++;
		    
		}while (multiplicador <= 10);
	}
}
