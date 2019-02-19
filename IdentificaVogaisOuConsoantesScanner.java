package listaUm;

import java.util.Scanner;

public class IdentificaVogaisOuConsoantesScanner {
	public static void main(String args[]) {
		String valor1;
		System.out.println("Digite UMA letra: ");
		Scanner entrada = new Scanner(System.in);
		valor1 = entrada.next();
		
	if(valor1.equals("a") || valor1.equals("e") || valor1.equals("i") || valor1.equals("o") || valor1.equals("u")) {
		System.out.println("Vogal");
	} else {
		System.out.println("Consoante");
	}

	}
}
