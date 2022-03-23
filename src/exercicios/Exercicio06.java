package exercicios;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe a matrícula do funcionário: ");
		int matricula = sc.nextInt();
		sc.nextLine();
		System.out.println("Informe o nome: ");
		String nome = sc.nextLine();		
		System.out.println("Informe a idade: ");
		int idade = sc.nextInt();
		sc.nextLine();
		System.out.println("Informe o sexo (F/M): ");
		char sexo = sc.next().toUpperCase().charAt(0);
		System.out.println("Informe o endereço: ");
		String endereco = sc.nextLine();
		sc.nextLine();
		System.out.println("Informe o bairro: ");
		String bairro = sc.nextLine();
		System.out.println("Informe estado civil: ");
		String estadoCivil = sc.next();

		System.out.println("O nome do funcionário é: " + nome);

		sc.close();
	}

}
