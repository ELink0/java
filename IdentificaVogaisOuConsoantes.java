package listaUm;

import javax.swing.JOptionPane;

public class IdentificaVogaisOuConsoantes {
	public static void main(String args[]) {
		String letra = JOptionPane.showInputDialog("Digite uma letra");
		String resultado = "";
		if(letra.equals("a")) {
			resultado = "Vogal";
		} else if(letra.equals("e")) {
			resultado = "Vogal";
		} else if(letra.equals("i")) {
			resultado = "Vogal";
		} else if(letra.equals("o")) {
			resultado = "Vogal";
		} else if(letra.equals("u")) {
			resultado = "Vogal";
		} else {
			resultado = "Consoante";
		};
		System.out.println(resultado);
	}
}
