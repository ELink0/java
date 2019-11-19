package principal;

public class Funcionario {
	protected double salarioHora;
	protected int horasTrabalhadas;
	protected double totalAdiantamento;

	public double calcularBonus() {
		double total = salarioHora * horasTrabalhadas;
		if(total > 2.001) {
			total *= 1.05;			
		}else if(total > 1.501) {
			total *= 1.03;
		}else if(total > 1.001) {
			total *= 1.02;

		}else {
			total *= 1.01;
		}
		return total;
	}
	
	public void setTotalAdiantamento(double totalAdiantamento) {
		this.totalAdiantamento = totalAdiantamento;
	}
	
	public double definirDesconto() {
		if(totalAdiantamento > 501) {
			return totalAdiantamento * 1.05;
		}else if(totalAdiantamento > 301) {
			return totalAdiantamento * 1.03;
		}else if(totalAdiantamento > 101) {
			return totalAdiantamento * 1.02;
		}else {
			return totalAdiantamento * 1.01;
		}
	}
	
	public double calcularSalarioFinal() {
		return calcularBonus() - definirDesconto();
	}
}
