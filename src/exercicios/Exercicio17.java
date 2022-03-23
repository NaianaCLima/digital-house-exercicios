package exercicios;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		
		System.out.println("Informe a altura: ");
		float altura = sc.nextFloat();
		System.out.println("Informe o sexo (F/M): ");
		char sexo = sc.next().toUpperCase().charAt(0);
		
		final float PESO_IDEAL_HOMEM = (float) ((72.7 * altura) - 58);
		final float PESO_IDEAL_MULHER = (float) ((62.1 * altura) - 44.7);
		
		System.out.println("Peso ideal para homens: " + PESO_IDEAL_HOMEM);
		System.out.println("Peso ideal para mulheres: " + PESO_IDEAL_MULHER);
		
		
		sc.close();
	}

}
