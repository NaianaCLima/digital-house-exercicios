package exercicios;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Nome do funcion�rio: ");
		String nome = sc.nextLine();
		System.out.println("Departamento do funcion�rio: ");
		String departamento = sc.nextLine();
		System.out.println("Sal�rio do funcion�rio: ");
		double salario = sc.nextDouble();

		double abono = salario * 0.1f;
		double novoSalario = salario + abono;

		System.out.printf("Sal�rio R$: %.2f", salario);
		System.out.printf("\nAbono R$: %.2f", abono);
		System.out.printf("\nNovo Sal�rio R$: %.2f", novoSalario);

		sc.close();
	}

}
