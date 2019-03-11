package exercicio;

import exercicio.Par;

public class Principal {
	public static void main(String[] args) {
		
		Par p = new Par();
		
		p.setNumero(1);
		
		if(p.verificar()){
			System.out.println("Par");
		}else {
			System.out.println("Impar");
		}
	}

}
