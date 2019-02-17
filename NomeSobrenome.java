package controle;

import javax.swing.JOptionPane;

public class NomeSobrenome {
	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite seu nome");
		Integer quantidadeCaracteresNome = nome.length();
		System.out.println("Seu nome tem "+quantidadeCaracteresNome+" letras");
		
		String[] palavrasNome = nome.split(" ");
		System.out.println("Seu primeiro nome é: "+palavrasNome[0]);
//		for(int x=0;x<palavrasNome.length;x++) {
//			System.out.println(palavrasNome[x]);
//		}
//		for(String palavra:palavrasNome) {
//			System.out.println(palavra);
//		}
	}
}
