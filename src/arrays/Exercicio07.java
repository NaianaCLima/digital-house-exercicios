package arrays;

public class Exercicio07 {

	public static void main(String[] args) {
		
		int [] valor = { 2, 8, 5 , 7, 1, 4};
		
		for(int i = 0; i < valor.length; i++) {
			if(valor[i] % 2 == 0) {
				valor[i] = 1;
			}else {
				valor[i] = -1;
			}
			System.out.print(valor[i] + " ");
		}

	}

}
