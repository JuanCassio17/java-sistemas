package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AlterarNomePessoa {
	
	public static void main(String[] args) throws SQLException {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o código da pessoa: ");
		int codigo = scanner.nextInt();
		
		String sqlSelect = "SELECT codigo, nome FROM pessoas WHERE codigo = ?";
		String sqlUpdate = "UPDATE pessoas SET nome = ? WHERE codigo = ?";
		Connection conexao = FabricaConexao.getConexao();
		PreparedStatement stmt = conexao.prepareStatement(sqlSelect);
		stmt.setInt(1, codigo);
		ResultSet resultado = stmt.executeQuery();
		
		if(resultado.next()) {
			Pessoa p = new Pessoa(resultado.getInt(1),
					resultado.getString(2));
			
			System.out.println("O nome atual é: " + p.getNome());
			scanner.nextLine();
			
			System.out.print("Informe o novo nome: ");
			String novoNome = scanner.nextLine();
			
			stmt.close();
			stmt = conexao.prepareStatement(sqlUpdate);
			stmt.setString(1, novoNome);
			stmt.setInt(2, codigo);
			stmt.execute();
			
			System.out.println("Pessoa alterada com sucesso.");
		
		} else {
			System.out.println("Pessoa não encontrada.");
		}
		
		conexao.close();
		scanner.close();
	}

}
