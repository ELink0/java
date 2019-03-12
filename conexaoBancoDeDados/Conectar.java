package exercicio;
// Utilizado o repositório Maven do MySQL Connector ou Driver MySQL


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import exercicio.Par;

public class Conectar {
	public static void main(String[] args) {
		Par p = new Par();
		
		// url
		String url = "jdbc:mysql://localhost:3306/banco?useTimezone=true&serverTimezone=UTC";
		// usuário
		String user = "root";
		// senha
		
		try {
		Connection conn = DriverManager.getConnection(url, user, "");
		
		Statement st = conn.createStatement();
		st.executeUpdate("INSERT INTO estado (nome, sigla) VALUES('INSIRA QUALQUER COISA', 'OI')");
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
