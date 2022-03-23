package exercicios;

public class Exercicio12 {

	public static void main(String[] args) {
		int A = 1, B = 2, C = 3, aux = 0;

		System.out.println("A = " + A + " B = " + B + " C = " + C);

		aux = A;
		A = C;
		C = B;
		B = aux;

		System.out.println("A = " + A + " B = " + B + " C = " + C);

	}

}
