package fundamentos;

public class Temperatura {
	
	public static void conversorCelsius(double fahrenheit) {
		double celsius = (fahrenheit - 32) * (5.0/ 9.0);
		System.out.println(celsius);
	
	}
	
	public static void main(String[] args) {
		
		final double FATOR = 5.0 / 9.0;
		final double AJUSTE = 32;
		
		double fahrenheit = 86;
		double celsius = (fahrenheit - AJUSTE) * FATOR;
		
		System.out.println(celsius);
		
		fahrenheit = 150;
		
		celsius = (fahrenheit - AJUSTE) * FATOR;
		System.out.println(celsius);
		
		// Método
		conversorCelsius(86);
		conversorCelsius(150);
		
	}

}
