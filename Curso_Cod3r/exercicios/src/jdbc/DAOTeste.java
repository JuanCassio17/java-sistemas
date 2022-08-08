package jdbc;

public class DAOTeste {
	
	public static void main(String[] args) {
		
		DAO dao = new DAO();
		String sql = "INSERT INTO pessoas (nome, codigo) values (?, ?);";
		System.out.println(dao.incluir(sql, "Ariana Grande", 1));
		System.out.println(dao.incluir(sql, "Camila Cabello", 2));
		System.out.println(dao.incluir(sql, "Olivia Rodrigo", 3));
		
		dao.close();
		
	}

}
