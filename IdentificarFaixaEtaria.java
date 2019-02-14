package controle;

import javax.swing.JOptionPane;

public class IdentificarFaixaEtaria {

	public static void main(String[] args) {
//		String nome1 = "José";
//		Integer idadeInteger = 10; // Tem mais funções do que o int normal
//		int idadeInt = 20;
//		Double salario = 10.; // Se o número for inteiro irá bugar, tem que ser número que tenha ponto
//		
//		// Para somar, dividir, multiplicar e etc. Utilizar o Double.
//		Double resultado = idadeInt+salario; // Exemplo de soma
		
//		String nome = JOptionPane.showInputDialog("Digite o nome: "); // Solicita que o usuário digite
//		String valor1 = JOptionPane.showInputDialog("Digite um salário: ");
//		String valor2 = JOptionPane.showInputDialog("Digite outro salário: ");
//		
//		valor1 = valor1.replace(",", "."); // Substitui vírgula para ponto
//		Double valor1Double = Double.parseDouble(valor1); // Transforma a String em Double
//		valor2 = valor2.replace(",", ".");
//		Double valor2Double = Double.parseDouble(valor2);
//		Double soma = valor1Double + valor2Double;
//		
//		System.out.println("O nome é: "+nome+"\n\nA soma dos valores "+valor1Double+" + "+valor2Double+" é "+soma); // Imprime o valor digitado pelo usuário
		
		String idadeString = JOptionPane.showInputDialog("Digite sua idade: ");
		int idade = Integer.parseInt(idadeString); // Converte String para int
		
		String situacaoFaixaEtaria="";
		if (idade >= 0 && idade < 11) {
			situacaoFaixaEtaria = ("Você é criança");
		} else if (idade >= 12 && idade < 17) {
			situacaoFaixaEtaria = ("Você é adolescente");
		} else if (idade >= 18 && idade < 59) {
			situacaoFaixaEtaria = ("Você é adulto");
		} else if (idade >= 60 && idade < 150) {
			situacaoFaixaEtaria = ("Você é idoso");
		} else if (idade >= 151) {
			situacaoFaixaEtaria = ("Você é mentiroso");
		}else  {
			situacaoFaixaEtaria = ("Idade Inválida");
		}
		System.out.println(situacaoFaixaEtaria);
		
	}
}
