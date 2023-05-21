package testes;

import java.sql.Connection;
import java.sql.SQLException;

import conexaojdbc.ConnectionFactory;

public class TestaConexo {

	public static void main(String[] args) throws SQLException {
		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection connection = connectionFactory.recuperarConexao();
		
		System.out.println("Conexao realizada com sucesso !!");
		
		connection.close();
	}
}
