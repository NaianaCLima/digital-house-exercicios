package exercicios;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		Calendar cal = GregorianCalendar.getInstance();

		int anoAtual = cal.get(Calendar.YEAR);
		int mesAtual = cal.get(Calendar.MONTH) + 1;
		int diaAtual = cal.get(Calendar.DAY_OF_MONTH);

		Scanner sc = new Scanner(System.in);

		System.out.println("Nome: ");
		String nome = sc.nextLine();
		System.out.println("Ano de nascimento: ");
		int ano = sc.nextInt();
		System.out.println("Mês de nascimento: ");
		int mes = sc.nextInt();
		System.out.println("Dia de nascimento: ");
		int dia = sc.nextInt();

		int idade = 0;

		if (mesAtual >= mes && diaAtual >= dia) {
			idade = anoAtual - ano;
		}else {
			idade = (anoAtual - ano) -1;
		}
		
		System.out.println(nome + " tem " + idade + " anos");

		sc.close();
	}

}
