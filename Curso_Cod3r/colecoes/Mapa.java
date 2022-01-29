package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	
	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<>();
		// Integer = Chave 
		// String = Valor
		
		usuarios.put(1, "Ednaldo Pereira");
		usuarios.put(2, "Galo Cego");
		usuarios.put(3, "Serjão Berranteiro");

		System.out.println(usuarios.size()); // verifica tamanho
		System.out.println(usuarios.isEmpty()); // verifica se está vazia
		System.out.println(usuarios.keySet()); // retorna as chaves
		System.out.println(usuarios.values()); // retorna os valores
		System.out.println(usuarios.entrySet()); // retorna chave + valor
		System.out.println(usuarios.containsValue("Ednaldo Pereira")); // contém?
		System.out.println(usuarios.get(2)); // retorna elemento de chave 2
		System.out.println(usuarios.remove(2)); // remove elemento de chave 2
		System.out.println(usuarios.remove(2, "Galo Cego")); // remove explicitamente
		
		for(int chave : usuarios.keySet()) {
			System.out.println(chave);
		}
		
		for(String valor : usuarios.values()) {
			System.out.println(valor);
		}
		
		for(Entry<Integer, String> registro : usuarios.entrySet()) {
			System.out.print(registro.getKey() + " - ");
			System.out.println(registro.getValue());
		}
		
		
	}

}
