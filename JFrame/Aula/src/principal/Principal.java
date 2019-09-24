package principal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Principal extends JFrame implements ActionListener{
	
	private JMenuBar jmb = new JMenuBar();
	private JMenu jogos = new JMenu("Jogos");
	private JMenu utilitarios = new JMenu("Utilitários");
	private JMenu ajuda = new JMenu ("Ajuda");
	
	private JMenuItem jogovelha = new JMenuItem("Jogo da Velha");
	private JMenuItem forca = new JMenuItem("Jogo da Forca");
	
	private JMenuItem calculadora = new JMenuItem("Calculadora");
	private JMenuItem info = new JMenuItem("Informações");
	
	public Principal() {
		definicoes();
		
	}
	
	private void definicoes() {
		setTitle("Click Jogos");
		setSize(800, 400);
		setJMenuBar(jmb);
		jmb.add(jogos);
		jmb.add(utilitarios);
		jmb.add(ajuda);
		
		jogos.add(jogovelha);
		jogos.add(forca);
		
		utilitarios.add(calculadora);
		
		ajuda.add(info);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		// tipo, nome, new construtor
		
		Principal p = new Principal();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == jogovelha) {
			TelaJogoDaVelha jdv = new TelaJogoDaVelha();
		}
		else if(e.getSource() == forca) {
			TelaJogoForca jf = new TelaJogoForca();
		}
		else if(e.getSource() == calculadora) {
			TelaCalculadora calc = new TelaCalculadora();
		}
		else if(e.getSource() == info) {
			TelaAjuda ajuda = new TelaAjuda();
		}
	}
}
