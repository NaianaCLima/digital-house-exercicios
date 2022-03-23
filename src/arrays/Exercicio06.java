package arrays;

public class Exercicio06 {

	public static void main(String[] args) {

		int[] arrayNum = { 5, 50, 42, 7, 36, 65, 71, 0 };
		int maior = arrayNum[0];

		for (int i = 0; i < arrayNum.length; i++) {
			if (arrayNum[i] > arrayNum[maior]) {
				maior = i;
			}
			
		}
		System.out.print(maior);

	}

}
