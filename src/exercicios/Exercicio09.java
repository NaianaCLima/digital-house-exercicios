package exercicios;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Nome do funcionário: ");
		String nome = sc.nextLine();
		System.out.println("Departamento do funcionário: ");
		String departamento = sc.nextLine();
		System.out.println("Salário do funcionário: ");
		double salario = sc.nextDouble();

		double abono = salario * 0.1f;
		double novoSalario = salario + abono;

		System.out.printf("Salário R$: %.2f", salario);
		System.out.printf("\nAbono R$: %.2f", abono);
		System.out.printf("\nNovo Salário R$: %.2f", novoSalario);

		sc.close();
	}

}
