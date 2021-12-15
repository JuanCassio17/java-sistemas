package fundamentos;

public class TipoStringEquals {
		
	public static void main(String[] args) {

		String a = "             java";
		String b = "    Java";
		
		boolean compara = a.equals(b);
		boolean comparaIgnoreCase = a.trim().equalsIgnoreCase(b.trim());
		// o método .trim() remove os espaços
		
		// System.out.println(compara);
		System.out.println(comparaIgnoreCase);
		
		//System.out.println("Java" == "Java"); // inadequado
	
	}
	

}
