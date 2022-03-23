package exercicios;

public class Exercicio16 {

	public static void main(String[] args) {
		float peso = 32.7f;
		double valorExcesso = 0;

		if (peso <= 20) {
			valorExcesso = 0.0;

		} else if (peso > 20 && peso <= 40) {
			valorExcesso = 5000.0;

		} else {
			valorExcesso = 10000.0;
		}

		System.out.println("Quanto você pagará de excesso R$: " + valorExcesso);

	}

}
