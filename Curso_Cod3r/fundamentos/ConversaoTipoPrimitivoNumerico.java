package fundamentos;

	
public class ConversaoTipoPrimitivoNumerico {
	
	public static void main(String[] args) {
		
		/* Cast é uma forma de conversão onde o
		* programador tem a certeza que quer
		* fazer a conversão */
		
		double a = 1; // conversão implícita
		System.out.println(a);
		
		float b = (float) 1.555423232312121212; // conversão explícita (CAST)

		System.out.println(b);
	
		int c = 130;
		byte d = (byte) c; // convertendo int para byte (CAST)
	
		System.out.println(c);
		System.out.println(d);
		
		double e = 1;
		int f = (int) e; // convertendo double para int (CAST)
		System.out.println(e);
		System.out.println(f);

	}

}
