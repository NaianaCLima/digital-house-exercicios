package arrays;

public class Exercicio05 {

	public static void main(String[] args) {

		int[] array = { 1, 2, -3, 4, 5, -6, -7, -8, 0 };
		boolean[] afirmacao = new boolean[9];

		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0) {
				afirmacao[i] = true;
			} else {
				afirmacao[i] = false;
			}
			System.out.print(afirmacao[i] + " ");
		}

	}

}
