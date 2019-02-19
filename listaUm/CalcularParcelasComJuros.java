package listaUm;

import javax.swing.JOptionPane;

public class CalcularParcelasComJuros {
	public static void main(String[]args){
		String valorString = JOptionPane.showInputDialog("Insira o valor do produto: ");
		String mesesString = JOptionPane.showInputDialog("Insira a quantidade de meses: ");
		
		double valor = Double.parseDouble(valorString);
		Integer meses = Integer.parseInt(mesesString);
		double parcelado = valor / meses;
		for(int x=1; x<meses; x++) {
			parcelado = parcelado * (1.05);
			System.out.println("Valor com juros no  "+ x + "º mês"+"=" + (parcelado));
		}
		double total = valor + parcelado;
		System.out.println("O valor total será: "+total);
	}
}
