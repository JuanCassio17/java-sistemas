package fundamentos;

public class Wrappers {
	
	public static void main(String[] args) {
		
		
		// byte
		Byte b = 100;
		Short s = 1000;
		Integer i = 1000; //int
		Long l = 100000L;

		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i + b);
		System.out.println(l /3.0);
		
		// Float
		
		Float f = 123.0F;
		System.out.println(f);
		
		// Double
		
		Double d = 12345.34;
		System.out.println(d);
		
		
		// Boolean
		
		Boolean bo = Boolean.parseBoolean("true"); 
		System.out.println(bo.toString().toUpperCase());
		
		// char
		Character c = '#';
		System.out.println(c.equals('*'));
		
	
	}
	

}
