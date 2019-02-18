package listaUm;

import javax.swing.JOptionPane;

public class IdentificaVogaisOuConsoantes {
	public static void main(String args[]) {
		String letra = JOptionPane.showInputDialog("Digite uma letra");
		if(letra.equals("a")) {
			System.out.println("Vogal");
		} else if(letra.equals("e")) {
			System.out.println("Vogal");
		} else if(letra.equals("i")) {
			System.out.println("Vogal");
		} else if(letra.equals("o")) {
			System.out.println("Vogal");
		} else if(letra.equals("u")) {
			System.out.println("Vogal");
		} else {
			System.out.println("Consoante");
		};
	}
}
