/**
 * 
 */
package model;

/**
 * @author Lucas Batista 7 de abr. de 2024
 */
public class Professor {
	private String nome;
	private String matricula;
	private int idade;
	private double salario;

	public Professor(String nome, String matricula, int idade, double salario) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.idade = idade;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void calcSalario() {

	}

	@Override
	public String toString() {
		return "Nome: " + nome + "\n" + "Matrícula: " + matricula + "\n" + "Idade: " + idade + "\n" + "Salário: R$"
				+ salario;
	}
}