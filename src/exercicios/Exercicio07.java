package exercicios;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o 1� n�mero: ");
		int num1 = sc.nextInt();
		System.out.println("Digite o 2� n�mero: ");
		int num2 = sc.nextInt();
		
		int soma = num1 + num2;
		
		System.out.println("A soma dos n�meros �: " + soma);
		
		sc.close();
	}

}
