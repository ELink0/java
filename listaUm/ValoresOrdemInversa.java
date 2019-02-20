package piloto;

import javax.swing.JOptionPane;

public class ValoresOrdemInversa {
	public static void main(String args[]) {
		String valores = JOptionPane.showInputDialog("Digite valores separados por vírgula");
		String[] arrayDeValores = valores.split(",");
		System.out.println("Tamanho do array: "+arrayDeValores.length);
		
        String saida = "" ;
        // assim mano aki q esta a logica ..
        for ( int i =  arrayDeValores.length - 1 ; i >= 0 ; i-- ) {
        saida = saida + arrayDeValores[i] +"\n";
        }
        System.out.println ( saida );
	}

}
