/**
 * 
 */
package view;

import model.ProfessorHorista;
import model.ProfessorTitular;

/**
 * @author Lucas Batista 7 de abr. de 2024
 */
public class Main {
	public static void main(String[] args) {

		ProfessorTitular professor1 = new ProfessorTitular("João", "123", 35, 10, 3000);
		professor1.calcSalario();
		System.out.println("Informações do Professor Titular:");
		System.out.println(professor1);

		ProfessorHorista professor2 = new ProfessorHorista("Maria", "456", 28, 0, 40, 50);
		professor2.calcSalario();
		System.out.println("\nInformações do Professor Horista:");
		System.out.println(professor2);

	}
}
