package arrays;

public class Exercicio03 {

	public static void main(String[] args) {

		int[] valoresInteiros = { -8, 10, 11, 16, -2, 50, -25 };
		int cont = 0;

		for (int i = 0; i < valoresInteiros.length; i++) {
			if (valoresInteiros[i] < 0) {
				cont++;
			}

		}
		System.out.println(cont);

	}

}
