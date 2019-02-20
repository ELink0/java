package listaUm;

import javax.swing.JOptionPane;

public class ValoresOrdenados {
	public static void main(String args[]) {
		//input de valores e transformando em lista string
		String valor = JOptionPane.showInputDialog("Insira os valores");
		String[] valoresStr = valor.split(",");
		
		//Converter listaString para listaInt
		Integer[] valoresInt = new Integer[valoresStr.length];
		
		for (int i = 0; i < valoresStr.length; i++) {
	    	valoresInt[i] = Integer.parseInt(valoresStr[i]);
	    }
		//ordenar valores

		if(valoresInt[0] > valoresInt[1]) {
			int temp = valoresInt[0];
			valoresInt[0] = valoresInt[1];
			valoresInt[1] = temp;
			System.out.println(valoresInt[0]);
		} else if(valoresInt[1] > valoresInt[2]) {
			int temp = valoresInt[1];
			valoresInt[1] = valoresInt[2];
			valoresInt[2] = temp;
			System.out.println(valoresInt[1]);
		} else {
			System.out.println(valoresInt[2]);
		}
	}
}
