/**
 * 
 */
package model;

/**
 * @author Lucas Batista 7 de abr. de 2024
 */
public class ProfessorHorista extends Professor {
	private int horasAula;
	private double valorHoraAula;

	public ProfessorHorista(String nome, String matricula, int idade, double salario, int horasAula,
			double valorHoraAula) {
		super(nome, matricula, idade, salario);
		this.horasAula = horasAula;
		this.valorHoraAula = valorHoraAula;
	}

	public int getHorasAula() {
		return horasAula;
	}

	public void setHorasAula(int horasAula) {
		this.horasAula = horasAula;
	}

	public double getValorHoraAula() {
		return valorHoraAula;
	}

	public void setValorHoraAula(double valorHoraAula) {
		this.valorHoraAula = valorHoraAula;
	}

	@Override
	public void calcSalario() {
		double novoSalario = horasAula * valorHoraAula;
		setSalario(novoSalario);
	}

	@Override
	public String toString() {
		return super.toString() + "\n" + "Horas aula: " + horasAula + "\n" + "Valor da hora aula: R$" + valorHoraAula;
	}
}
