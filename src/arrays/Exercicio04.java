package arrays;

public class Exercicio04 {

	public static void main(String[] args) {

		int[] arrayA = { 2, 7, 11, 25, 9, 2, 1, 1, 9, 11 };
		int x = 11;
		int cont = 0;

		for (int i = 0; i < arrayA.length; i++) {
			if (arrayA[i] == x) {
				cont++;
			}
		}
		System.out.println(cont);

	}

}
