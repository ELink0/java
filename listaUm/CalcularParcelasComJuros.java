package listaUm;

import javax.swing.JOptionPane;

public class CalcularParcelasComJuros {
	public static void main(String[]args){
		String valorString = JOptionPane.showInputDialog("Insira o valor do produto: ");
		String mesesString = JOptionPane.showInputDialog("Insira a quantidade de meses: ");
		
		double valor = Double.parseDouble(valorString);
		Integer meses = Integer.parseInt(mesesString);
		
//		for(int x=0; x<meses; x++) {
//			valor = valor * (1.05);
//		}
		Double resultado = valor*Math.pow(1.05, meses);
		System.out.println("O valor total é "+resultado);
		
		
	}
}
