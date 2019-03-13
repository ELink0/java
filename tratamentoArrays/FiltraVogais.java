package exercicios;

import java.util.Arrays;
import java.util.List;

public class LetrasVogais {
	
	public static final List<Character> VOGAIS = Arrays.asList('a','e','i','o','u');
	
	public static String vogais(String nome) {
		String letrasVogais ="";
		
		for (char c : nome.toCharArray()) {
//	Poderia ser também if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
			if (VOGAIS.contains(Character.toLowerCase(c))) {
				letrasVogais += c;
			}
		}
		return letrasVogais;
	}
	
	public static void main(String[] args) {}

}
