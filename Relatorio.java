package relatorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JFrame;

import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

public class Relatorio extends JFrame{
	private String url = "jdbc:mysql://localhost:3306/banco?useTimezone=true&serverTimezone=UTC";
	private String usuario = "root";
	private String senha = "";
	private String rel = System.getProperty("user.dir")+"/estado.jrxml";
	
	public Relatorio() {
		setSize(800, 600);
		try {
			// conexão
			Connection conn = DriverManager.getConnection(url, usuario, senha);
			// responsável em executar comandos
			Statement st = conn.createStatement();
			
			ResultSet rs = st.executeQuery("SELECT * FROM ESTADO");
			
			//transformar dados em um formato q o JR entende
			JRResultSetDataSource jrds = new JRResultSetDataSource(rs);
			
			//compilar o relatório
			JasperReport jr = JasperCompileManager.compileReport(rel);
			
			//preencher relatório
			JasperPrint jp = JasperFillManager.fillReport(jr,null,jrds);
			
			JasperViewer jv = new JasperViewer(jp);
			
			getContentPane().add(jv.getContentPane());
		}catch(Exception e) {
			e.printStackTrace();
		}
		setVisible(true);
	};
	
	public static void main(String args[]) {
		new Relatorio();
	}
}
