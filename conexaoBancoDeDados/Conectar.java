package bancoDeDados;
// Utilizado o repositório Maven do MySQL Connector ou Driver MySQL


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

import bancoDeDados.Par;

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
		
		String resposta = "s";
		while(resposta.equals("s")){
			resposta = JOptionPane.showInputDialog("Deseja cadastrar mais dados? [s] ou [n]");
	
			if (resposta.equals("n")){
				break;
			}
			String nome = JOptionPane.showInputDialog("Insira seu nome");
			String cpf = JOptionPane.showInputDialog("Insira seu cpf");
			String nomeEstado = JOptionPane.showInputDialog("Insira o seu Estado");
			String sigla = JOptionPane.showInputDialog("Insira a sigla do Estado");
			
			
			Statement st = conn.createStatement();
			st.executeUpdate("INSERT INTO PESSOA(NOME,CPF) VALUES('"+nome+"','"+cpf+"')");
			st.executeUpdate("INSERT INTO ESTADO(NOMEEST,SIGLA) VALUES('"+nomeEstado+"','"+sigla+"')");
			
			
			ResultSet rs = st.executeQuery("SELECT * FROM PESSOA");
			
			String resultado = "";
			
			while(rs.next()) {
				resultado = resultado + rs.getString("pedro")+"\n";
			}
			JOptionPane.showMessageDialog(null, resultado);
		}
		

		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
