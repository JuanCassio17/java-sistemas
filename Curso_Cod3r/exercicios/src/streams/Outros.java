package streams;

import java.util.Arrays;
import java.util.List;

public class Outros {
	
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.1, true);
		Aluno a2 = new Aluno("Luna", 6.1, true);
		Aluno a3 = new Aluno("Gui", 8.1, true);
		Aluno a4 = new Aluno("Gabi", 10, true);
		
		Aluno a5 = new Aluno("Ana", 7.1, true);
		Aluno a6 = new Aluno("Pedro", 6.1, true);
		Aluno a7 = new Aluno("Gui", 8.1, true);
		Aluno a8 = new Aluno("Maria", 10, true);
		
		List<Aluno> alunos = 
				Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);
		
		System.out.println("distinct...");
		alunos.stream().distinct().forEach(System.out::println);
		
		System.out.println("\nSkip/Limit");
		alunos.stream()
			  .distinct()
			  .skip(2)
			  .limit(2)
			  .distinct().forEach(System.out::println);
		
		System.out.println("\ntakeWhile");
		alunos.stream()
			  .distinct()
			  .skip(2)
			  .takeWhile(a -> a.nota >= 7)
			  .distinct().forEach(System.out::println);
		
	}

}
