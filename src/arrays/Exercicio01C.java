package arrays;

public class Exercicio01C {

	public static void main(String[] args) {
		
		int [] valoresC = new int[11];
		
		for(int i = 1; i < valoresC.length; i++) {
			
			if(i <= 5) {
				valoresC[i] = i;
			}else {
				valoresC[i] = (i - 5) * 10;
			}
			System.out.print(valoresC[i] + " ");
		}

	}

}
