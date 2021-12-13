package fundamentos;

public class ConversaoNumeroString {
	
	public static void main(String[] args) {
		
		// conversão com wrapper
		Integer num = 10000;
		System.out.println(num.toString().length());
		
		// conversão com tipo primitivo
		int num2 = 100;
		System.out.println(Integer.toString(num2).length());
		
		// conversão gambiarra
		int num3 = 10;
		System.out.println(("" + num3).length());

	
	}
	

}
