package listaUm;

import java.util.Scanner;

public class Somar {
	public static void main(String args[]) {
		Calculadora calc = new Calculadora();
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o primeiro número");
		calc.num1 = entrada.nextInt();
		
		System.out.println("Digite o segundo número");
		calc.num2 = entrada.nextInt();
		
		int total = calc.somar();
		
		System.out.println(total);
	}
}
