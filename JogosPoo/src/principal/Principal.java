package principal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Principal extends JFrame implements ActionListener{
	
	private JMenuBar jmb = new JMenuBar();
	private JMenu jogos = new JMenu("Jogos");
	private JMenu utilitarios = new JMenu("Utilitários");
	private JMenu ajuda = new JMenu ("Ajuda");
	private JDesktopPane desk = new JDesktopPane();
	
	private TelaJogoDaVelha tjv;
	private TelaJogoForca tjfc;
	private TelaAjuda taj;
	private TelaCalculadora tcalc;
	
	
	private JMenuItem jogovelha = new JMenuItem("Jogo da Velha");
	private JMenuItem forca = new JMenuItem("Jogo da Forca");
	
	private JMenuItem calculadora = new JMenuItem("Calculadora");
	private JMenuItem info = new JMenuItem("Informações");
	
	public Principal() {
		definicoes();
		
	}
	
	/**
	 * 
	 */
	private void definicoes() {
		setTitle("Click Jogos");
		setSize(1590, 860);
		setJMenuBar(jmb);
		jmb.add(jogos);
		jmb.add(utilitarios);
		jmb.add(ajuda);
		
		jogos.add(jogovelha);
		jogos.add(forca);
		
		utilitarios.add(calculadora);
		
		ajuda.add(info);
		
		jogovelha.addActionListener(this);
		add(desk);
		setVisible(true);
		
		forca.addActionListener(this);
		add(desk);
		setVisible(true);
		
		calculadora.addActionListener(this);
		add(desk);
		setVisible(true);
		
		info.addActionListener(this);
		add(desk);
		setVisible(true);
	}

	public static void main(String[] args) {
		// tipo, nome, new construtor
		
		Principal p = new Principal();

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == jogovelha) {
			if(tjv == null) {
				tjv = new TelaJogoDaVelha();
				desk.add(tjv);
			}
		}
		else if(e.getSource() == forca) {
			if(tjfc == null) {
				tjfc = new TelaJogoForca();
				desk.add(tjfc);
			}
		}
		else if(e.getSource() == calculadora) {
			if(taj == null) {
				taj = new TelaAjuda();
				desk.add(taj);
			}
		}
		else if(e.getSource() == info) {
			if(tcalc == null) {
				tcalc = new TelaCalculadora();
				desk.add(tcalc);
			}
		}
	}
}