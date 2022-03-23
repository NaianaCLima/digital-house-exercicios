package exercicios;

public class Exercicio05 {

	public static void main(String[] args) {
		
		int num1 = 8, num2 = 5, num3 = 3;
		
		if(num1 > num2 && num1 > num3) {
			System.out.println("O 1º número é maior! " + num1);
		}else if(num2 > num1 && num2 > num3) {
			System.out.println("O 2º número é maior! " + num2);
		}else {
			System.out.println("O 3º número é maior! " + num3);
		}
		
		if(num1 < num2 && num1 < num3) {
			System.out.println("O 1º número é menor! " + num1);
		}else if(num2 < num1 && num2 < num3) {
			System.out.println("O 2º número é menor! " + num2);
		}else {
			System.out.println("O 3º número é menor! " + num3);
		}
	}

}
