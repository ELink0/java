import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

import java.io.BufferedReader;

public class LendoArquivos {

	public static void main(String[] args) {
		try {
			String arquivoNome = JOptionPane.showInputDialog(null, "Digite o nome do arquivo");
			
			FileReader fr = new FileReader(arquivoNome);
			BufferedReader br = new BufferedReader(fr);
			String linha = "";
			while (linha != null) {
				linha = br.readLine();
				if (linha != null)
					System.out.println(linha);
			}
		} catch (IOException e) {
			System.out.println("Erro ao utlizar o arquivo: " + e.getMessage());
		}

	}

}
