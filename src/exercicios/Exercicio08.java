package exercicios;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nome do aluno: ");
		String nome = sc.nextLine();
		System.out.println("Informe a 1� nota: ");
		float nota1 = sc.nextFloat();
		System.out.println("Informe a 2� nota: ");
		float nota2 = sc.nextFloat();
		System.out.println("Informe a 3� nota: ");
		float nota3 = sc.nextFloat();
		
		float media = (nota1 + nota2 + nota3) / 3;
		
		System.out.printf("O aluno(a) %s , m�dia: %.1f", nome, media);
		
		sc.close();
	}

}
