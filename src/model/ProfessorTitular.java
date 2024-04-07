/**
 * 
 */
package model;

/**
 * @author Lucas Batista 7 de abr. de 2024
 */
public class ProfessorTitular extends Professor {
	private int anosInstituicao;

	public ProfessorTitular(String nome, String matricula, int idade, int anosInstituicao, double salario) {
		super(nome, matricula, idade, salario);
		this.anosInstituicao = anosInstituicao;
	}

	public int getAnosInstituicao() {
		return anosInstituicao;
	}

	public void setAnosInstituicao(int anosInstituicao) {
		this.anosInstituicao = anosInstituicao;
	}

	@Override
	public void calcSalario() {
		// Incrementa 5% para cada 5 anos de instituição
		int incrementoAnos = anosInstituicao / 5;
		double novoSalario = getSalario() * (1 + (0.05 * incrementoAnos));
		setSalario(novoSalario);
	}

	@Override
    public String toString() {
        return super.toString() + "\n" +
               "Anos na instituição: " + anosInstituicao;
    }
}
