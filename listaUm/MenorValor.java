package listaUm;

import javax.swing.JOptionPane;

public class MenorValor {
	public static void main(String args[]) {
		String v1String = JOptionPane.showInputDialog("Digite um valor");
		int v1 = Integer.parseInt(v1String);
		String v2String = JOptionPane.showInputDialog("Digite um valor");
		int v2 = Integer.parseInt(v2String);
		
		String resultado = (v1 < v2) ? "O menor valor é: "+v1 : "O menor valor é: "+v2;
		System.out.println(resultado);
		
//		if(v1 <= v2) {
//			System.out.println("O menor valor é: "+v1);
//		} else {
//			System.out.println("O menor valor é: "+v2);
//		}
				
	}
}
