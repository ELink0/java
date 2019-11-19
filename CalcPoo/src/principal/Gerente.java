package principal;

public class Gerente extends Funcionario{

	private int qtdeFuncionario;
	
	@Override
	public double calcularBonus() {
		double total = salarioHora * horasTrabalhadas;
		if(qtdeFuncionario > 31) {
			total *= 1.15;			
		}else if(qtdeFuncionario > 21) {
			total *= 1.10;
		}else if(qtdeFuncionario > 11) {
			total *= 1.06;

		}else {
			total *= 1.03;
		}
		return total;
	}

}
