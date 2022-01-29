package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	
	@SuppressWarnings({"rawtypes", "unchecked"})
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		// converte para classes wrappers
		
		conjunto.add(1.2); // double para -> Double
		conjunto.add("Teste"); // String
		conjunto.add(true); // boolean para -> Boolean
		conjunto.add(1); // int -> Integer
		
		conjunto.add("teste");
		System.out.println("Tamanho é: " + conjunto.size());
		
		conjunto.remove("Teste");
		System.out.println("Tamanho é: " + conjunto.size());
		System.out.println(conjunto.contains("Teste"));
		conjunto.remove("Teste");
		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		
		nums.addAll(conjunto); // união entre dois conjuntos
		System.out.println(nums);
		
		nums.retainAll(conjunto); // interseção entre conjuntos
		
		
	}

}
