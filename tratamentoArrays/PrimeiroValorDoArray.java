package exercicios;

import java.security.InvalidParameterException;

public class PrimeiroValorDoArray {
	public static int primeiroElemento(int[] numeros) {
		if (numeros != null && numeros.length > 0)
			return numeros[0];
		
		throw new InvalidParameterException("O array não pode ser vazio");
	}
	public static void main(String[] args) {
		int[] n = new int[] {1,2,3,4,5,6,7,8,9}; // Pode ser usado também uma interface para solicitar os números
		System.out.println(primeiroElemento(n));
	}

}
