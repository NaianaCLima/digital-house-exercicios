package arrays;

public class Exercicio01B {

	public static void main(String[] args) {
		/*Para  cada  conjunto  de  valores  abaixo,  escreva  o  código  Java,  usando  laço(s),  que 
		preencha um array com os valores:  
		b) 0 1 4 9 16 25 36 49 64 81 100*/
		
		int [] valoresB = new int[11];
				
		for(int i = 0; i < valoresB.length; i++) {
			valoresB[i] = i * i;
			System.out.print(valoresB[i] + " ");
		}

	}

}
