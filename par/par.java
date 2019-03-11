package exercicio;

public class Par {
	private int numero;
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int novoValor) {
		if(novoValor <= 10 || novoValor >= -10) {
			numero = novoValor;
		}
	}
	
	public boolean verificar() {
		if(numero % 2 == 0) {
			return true;
		}else {
			return false;
		}
	}
}
